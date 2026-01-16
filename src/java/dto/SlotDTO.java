/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.sql.Timestamp;



public class SlotDTO {
        private int id;
    private int doctorId;
    private Timestamp slotTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public Timestamp getSlotTime() {
        return slotTime;
    }

    public void setSlotTime(Timestamp slotTime) {
        this.slotTime = slotTime;
    }
    
    
}
