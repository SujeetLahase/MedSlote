/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.DoctorDTO;
import dto.SlotDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import utill.DBConnection;

public class DoctorDAO {

    // Search doctor 
   public List<DoctorDTO> searchDoctor(String keyword) {

    List<DoctorDTO> list = new ArrayList<>();

    try {
        Connection con = DBConnection.getConnection();

        String sql = "SELECT * FROM doctors " +
                     "WHERE LOWER(name) LIKE ? " +
                     "OR LOWER(specialization) LIKE ? " +
                     "OR LOWER(address) LIKE ?";

        PreparedStatement ps = con.prepareStatement(sql);

        String key = "%" + keyword.toLowerCase() + "%";

        ps.setString(1, key);
        ps.setString(2, key);
        ps.setString(3, key);

        //System.out.println("Executing SQL with key: " + key);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            DoctorDTO d = new DoctorDTO();
            d.setId(rs.getInt("id"));
            d.setName(rs.getString("name"));
            d.setSpecialization(rs.getString("specialization"));
            d.setAddress(rs.getString("address"));
            list.add(d);
            
            //System.out.println("Total doctors found: " + list.size());
            //System.out.println("Total doctors found: " + list);
            


        }

    } catch (Exception e) {
        e.printStackTrace();
    }
 
   // System.out.println("send");
    return list;
}



    // Get available slots
public List<SlotDTO> getAvailableSlots(int doctorId) {

    List<SlotDTO> slots = new ArrayList<>();

    try (Connection con = DBConnection.getConnection()) {

        String sql =
          "SELECT * FROM doctor_slots WHERE doctor_id=? AND is_booked=false";

        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, doctorId);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            SlotDTO s = new SlotDTO();
            s.setId(rs.getInt("id"));
            s.setDoctorId(doctorId);
            s.setSlotTime(rs.getTimestamp("slot_time")); // ✅ IMPORTANT
            slots.add(s);
        }

    } catch (Exception e) {
        e.printStackTrace();
    }

    return slots;
}


//Admin part
public void addDoctor(String name, String email, String specialization,
                      String address, String password) {

    String sql =
        "INSERT INTO doctors (name,email,specialization,address,password) " +
        "VALUES (?,?,?,?,SHA2(?,256))";

    try (Connection con = DBConnection.getConnection();
         PreparedStatement ps = con.prepareStatement(sql)) {

        ps.setString(1, name);
        ps.setString(2, email);
        ps.setString(3, specialization);
        ps.setString(4, address);
        ps.setString(5, password);
        ps.executeUpdate();

    } catch (Exception e) {
        e.printStackTrace();
    }
}

public List<DoctorDTO> getAllDoctors() {

        List<DoctorDTO> list = new ArrayList<>();

        String sql = "SELECT id, name, email, specialization, address FROM doctors";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                DoctorDTO d = new DoctorDTO();
                d.setId(rs.getInt("id"));
                d.setName(rs.getString("name"));
                d.setEmail(rs.getString("email"));
                d.setSpecialization(rs.getString("specialization"));
                d.setAddress(rs.getString("address"));
                list.add(d);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

}
