package dao;

import dto.SlotDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import utill.DBConnection;

public class SlotDAO {

    // ➕ Add slot
    public boolean addSlot(int doctorId, Timestamp slotTime) {

        String sql =
            "INSERT INTO doctor_slots (doctor_id, slot_time) VALUES (?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, doctorId);
            ps.setTimestamp(2, slotTime);
            ps.executeUpdate();
            return true;

        } catch (SQLException e) {
            return false; // duplicate slot
        }
    }

    // ❌ Remove slot
    public void deleteSlot(int slotId) {

        String sql = "DELETE FROM doctor_slots WHERE id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, slotId);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 📋 Get doctor slots
    public List<SlotDTO> getDoctorSlots(int doctorId) {

        List<SlotDTO> list = new ArrayList<>();

        String sql =
            "SELECT * FROM doctor_slots WHERE doctor_id=? ORDER BY slot_time";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, doctorId);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                SlotDTO s = new SlotDTO();
                s.setId(rs.getInt("id"));
                s.setDoctorId(doctorId);
                s.setSlotTime(rs.getTimestamp("slot_time"));
                list.add(s);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}
