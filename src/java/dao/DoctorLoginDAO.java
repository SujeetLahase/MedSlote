package dao;

import dto.DoctorDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import utill.DBConnection;
import utill.PasswordUtil;



public class DoctorLoginDAO {

    public DoctorDTO login(String email, String password) {

        DoctorDTO doctor = null;

        String sql = "SELECT id, name, email, specialization " +
                     "FROM doctors WHERE email=? AND password=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            String hashedPassword = PasswordUtil.hashPassword(password);
           
           // System.out.println("Email = " + email);
            //System.out.println("Hashed Input = " + hashedPassword);


            ps.setString(1, email);
            ps.setString(2, hashedPassword);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                doctor = new DoctorDTO();
                doctor.setId(rs.getInt("id"));
                doctor.setName(rs.getString("name"));
                doctor.setEmail(rs.getString("email"));
                doctor.setSpecialization(rs.getString("specialization"));
                
                // System.out.println(doctor);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        //System.out.println("send");
        return doctor;
    }
}
