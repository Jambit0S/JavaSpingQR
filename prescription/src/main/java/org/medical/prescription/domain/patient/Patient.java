package org.medical.prescription.domain.patient;


import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table
@ToString(of = {
        "id",
        "first_name",
        "second_name",
        "patronymic",
        "date_birth",
        "insurance_number",
        "med_policy_number"

})
@EqualsAndHashCode(of = {"id"})
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String first_name;
    private String second_name;
    private String patronymic;
    private String date_birth;
    private String insurance_number;
    private String med_policy_number;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getDate_birth() {
        return date_birth;
    }

    public void setDate_birth(String date_birth) {
        this.date_birth = date_birth;
    }

    public String getInsurance_number() {
        return insurance_number;
    }

    public void setInsurance_number(String insurance_number) {
        this.insurance_number = insurance_number;
    }

    public String getMed_policy_number() {
        return med_policy_number;
    }

    public void setMed_policy_number(String med_policy_number) {
        this.med_policy_number = med_policy_number;
    }




}
