/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.UserDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utill.DBConnection;

public class UserDAO {

    // Check email exists
    public boolean isEmailExists(String email) {
        boolean exists = false;
        try {
            Connection con = DBConnection.getConnection();
            String sql = "SELECT id FROM users WHERE email=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, email);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                exists = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return exists;
    }

    // Save user
    public boolean registerUser(UserDTO user) {
        boolean status = false;
        try {
            Connection con = DBConnection.getConnection();
            String sql = "INSERT INTO users(name,email,password,pincode) VALUES (?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());
            ps.setString(4, user.getPincode());

            status = ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
    
    
     public int login(String email, String hashedPassword) {
        int userId = 0;
        try {
            Connection con = DBConnection.getConnection();
            String sql = "SELECT id FROM users WHERE email=? AND password=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, email);
            ps.setString(2, hashedPassword);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                userId = rs.getInt("id");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userId; // 0 = invalid login
    }
     
         public void saveOTP(String email, String otp) {
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps =
              con.prepareStatement(
               "INSERT INTO password_reset_otp VALUES (?, ?, NOW() + INTERVAL 5 MINUTE)");
            ps.setString(1, email);
            ps.setString(2, otp);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean verifyOTP(String email, String otp) {
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps =
              con.prepareStatement(
               "SELECT * FROM password_reset_otp WHERE email=? AND otp=? AND expiry_time > NOW()");
            ps.setString(1, email);
            ps.setString(2, otp);

            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public void updatePassword(String email, String hashedPassword) {
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps =
              con.prepareStatement("UPDATE users SET password=? WHERE email=?");
            ps.setString(1, hashedPassword);
            ps.setString(2, email);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteOTP(String email) {
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps =
              con.prepareStatement("DELETE FROM password_reset_otp WHERE email=?");
            ps.setString(1, email);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    
    public List<UserDTO> getAllUsers() {

    List<UserDTO> list = new ArrayList<>();

    String sql = "SELECT id, name, email FROM users";

    try (Connection con = DBConnection.getConnection();
         PreparedStatement ps = con.prepareStatement(sql)) {

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            UserDTO u = new UserDTO();
            u.setId(rs.getInt("id"));
            u.setName(rs.getString("name"));
            u.setEmail(rs.getString("email"));
            list.add(u);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return list;
}

}
