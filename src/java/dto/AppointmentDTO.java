package dto;

import java.sql.Timestamp;

public class AppointmentDTO {

    private int id;
    private String doctorName;
    private String specialization;
    private Timestamp slotTime;
    private String patientName;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getDoctorName() { return doctorName; }
    public void setDoctorName(String doctorName) { this.doctorName = doctorName; }
    
    
     public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }

    public Timestamp getSlotTime() { return slotTime; }
    public void setSlotTime(Timestamp slotTime) { this.slotTime = slotTime; }
}
