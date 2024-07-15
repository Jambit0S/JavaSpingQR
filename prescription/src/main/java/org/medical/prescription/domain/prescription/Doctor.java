package org.medical.prescription.domain.prescription;

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
        "medical_organization",
        "login",
        "pass"})
@EqualsAndHashCode(of = {"id"})
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String first_name;
    private String second_name;
    private String patronymic;
    private String medical_organization;
    private String login;
    private String pass;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setMedical_organization(String medical_organization) {
        this.medical_organization = medical_organization;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Integer getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getMedical_organization() {
        return medical_organization;
    }

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }

}
