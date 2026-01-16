package dao;

import dto.AppointmentDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

import java.util.ArrayList;
import java.util.List;
import utill.DBConnection;

public class AppointmentDAO {

    public boolean bookAppointment(int userId, int doctorId, Timestamp slotTime) {

        String checkSql =
            "SELECT id FROM appointments " +
            "WHERE doctor_id=? AND slot_time=? FOR UPDATE";

        String insertSql =
            "INSERT INTO appointments (user_id, doctor_id, slot_time) VALUES (?, ?, ?)";

        try (Connection con = DBConnection.getConnection()) {

            con.setAutoCommit(false); // 🔒 transaction start

            // 1️⃣ Check if already booked
            try (PreparedStatement ps = con.prepareStatement(checkSql)) {
                ps.setInt(1, doctorId);
                ps.setTimestamp(2, slotTime);
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    con.rollback();
                    return false; // ❌ double booking prevented
                }
            }

            // 2️⃣ Insert appointment
            try (PreparedStatement ps = con.prepareStatement(insertSql)) {
                ps.setInt(1, userId);
                ps.setInt(2, doctorId);
                ps.setTimestamp(3, slotTime);
                ps.executeUpdate();
            }

            con.commit(); // ✅ success
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    
    public List<AppointmentDTO> getUserAppointments(int userId) {

    List<AppointmentDTO> list = new ArrayList<>();

    String sql =
        "SELECT a.id, a.slot_time, d.name, d.specialization " +
        "FROM appointments a " +
        "JOIN doctors d ON a.doctor_id = d.id " +
        "WHERE a.user_id=? " +
        "ORDER BY a.slot_time DESC";

    try (Connection con = DBConnection.getConnection();
         PreparedStatement ps = con.prepareStatement(sql)) {

        ps.setInt(1, userId);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            AppointmentDTO dto = new AppointmentDTO();
            dto.setId(rs.getInt("id"));
            dto.setDoctorName(rs.getString("name"));
            dto.setSpecialization(rs.getString("specialization"));
            dto.setSlotTime(rs.getTimestamp("slot_time"));
            list.add(dto);
        }

    } catch (Exception e) {
        e.printStackTrace();
    }

    return list;
}
    
    
    
    
    public List<AppointmentDTO> getAllAppointments() {

    List<AppointmentDTO> list = new ArrayList<>();

    String sql =
        "SELECT a.id, a.slot_time, u.name AS user, d.name AS doctor " +
        "FROM appointments a " +
        "JOIN users u ON a.user_id=u.id " +
        "JOIN doctors d ON a.doctor_id=d.id " +
        "ORDER BY a.slot_time DESC";

    try (Connection con = DBConnection.getConnection();
         PreparedStatement ps = con.prepareStatement(sql)) {

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            AppointmentDTO dto = new AppointmentDTO();
            dto.setId(rs.getInt("id"));
            dto.setSlotTime(rs.getTimestamp("slot_time"));
            dto.setPatientName(rs.getString("user"));
            dto.setDoctorName(rs.getString("doctor"));
            list.add(dto);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return list;
}


}
