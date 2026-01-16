package dao;

import dto.AppointmentDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utill.DBConnection;

public class DoctorAppointmentDAO {

    public List<AppointmentDTO> getAppointmentsByDoctor(int doctorId) {

        List<AppointmentDTO> list = new ArrayList<>();

        String sql =
            "SELECT a.id, a.slot_time, u.name AS patient_name " +
            "FROM appointments a " +
            "JOIN users u ON a.user_id = u.id " +
            "WHERE a.doctor_id = ? " +
            "ORDER BY a.slot_time";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, doctorId);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                AppointmentDTO dto = new AppointmentDTO();
                dto.setId(rs.getInt("id"));
                dto.setSlotTime(rs.getTimestamp("slot_time")); // ✅ FIX
                dto.setPatientName(rs.getString("patient_name"));
                list.add(dto);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}
