package org.medical.prescription.domain.patient;

import lombok.ToString;

import javax.persistence.*;

@Entity
@Table
@ToString(of = {
        "id",
        "id_patient",
        "id_doctor",
        "date_registration",
        "date_time_record",
        "is_served"
})
public class RecordsOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int id_patient;
    private int id_doctor;
    private String date_registration;
    private String date_time_record;
    private Boolean is_served;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_patient() {
        return id_patient;
    }

    public void setId_patient(int id_patient) {
        this.id_patient = id_patient;
    }

    public int getId_doctor() {
        return id_doctor;
    }

    public void setId_doctor(int id_doctor) {
        this.id_doctor = id_doctor;
    }

    public String getDate_registration() {
        return date_registration;
    }

    public void setDate_registration(String date_registration) {
        this.date_registration = date_registration;
    }

    public String getDate_time_record() {
        return date_time_record;
    }

    public void setDate_time_record(String date_time_record) {
        this.date_time_record = date_time_record;
    }

    public Boolean getIs_served() {
        return is_served;
    }

    public void setIs_served(Boolean is_served) {
        this.is_served = is_served;
    }


}
