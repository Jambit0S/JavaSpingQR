package org.medical.prescription.domain.prescription;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table
@ToString(of = {
        "id",
        "id_doctor",
        "id_patient",
        "id_drug_form",
        "id_prescription_status",
        "id_duration",
        "id_mkb_dot_code",
        "is_benefit",
        "is_narcotic",
        "is_child",
        "is_electronic_prescription",
        "is_cito",
        "create_date",
        "address_patient",
        "qr_code",
        "number_prescription",
        "count_day",
        "id_patient_benefit",
        "usability",
        "sign"
})
@EqualsAndHashCode(of = {"id"})
@AllArgsConstructor
@NoArgsConstructor
public class Prescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer id_doctor;
    private Integer id_patient;
    private Integer id_drug_form;
    private Integer id_prescription_status;
    private Integer id_duration;
    private Integer id_mkb_dot_code;
    private Boolean is_benefit;
    private Boolean is_narcotic;
    private Boolean is_child;
    private Boolean is_electronic_prescription;
    private Boolean is_cito;
    private String number_prescription;
    private String create_date;
    private Integer count_day;
    private String address_patient;
    private String qr_code;
    private Integer id_patient_benefit;
    private String usability;
    private String sign;

    public String getAddress_patient() {
        return address_patient;
    }

    public void setAddress_patient(String address_patient) {
        this.address_patient = address_patient;
    }


    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getUsability() {
        return usability;
    }

    public void setUsability(String usability) {
        this.usability = usability;
    }
    public Integer getId_patient_benefit() {
        return id_patient_benefit;
    }

    public void setId_patient_benefit(Integer id_patient_benefit) {
        this.id_patient_benefit = id_patient_benefit;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_doctor() {
        return id_doctor;
    }

    public void setId_doctor(Integer id_doctor) {
        this.id_doctor = id_doctor;
    }

    public Integer getId_patient() {
        return id_patient;
    }

    public void setId_patient(Integer id_patient) {
        this.id_patient = id_patient;
    }

    public Integer getId_drug_form() {
        return id_drug_form;
    }

    public void setId_drug_form(Integer id_drug_form) {
        this.id_drug_form = id_drug_form;
    }

    public Integer getId_prescription_status() {
        return id_prescription_status;
    }

    public void setId_prescription_status(Integer id_prescription_status) {
        this.id_prescription_status = id_prescription_status;
    }

    public Integer getId_duration() {
        return id_duration;
    }

    public void setId_duration(Integer id_duration) {
        this.id_duration = id_duration;
    }

    public Integer getId_mkb_dot_code() {
        return id_mkb_dot_code;
    }

    public void setId_mkb_dot_code(Integer id_mkb_dot_code) {
        this.id_mkb_dot_code = id_mkb_dot_code;
    }

    public Boolean getIs_benefit() {
        return is_benefit;
    }

    public void setIs_benefit(Boolean is_benefit) {
        this.is_benefit = is_benefit;
    }

    public Boolean getIs_narcotic() {
        return is_narcotic;
    }

    public void setIs_narcotic(Boolean is_narcotic) {
        this.is_narcotic = is_narcotic;
    }

    public Boolean getIs_child() {
        return is_child;
    }

    public void setIs_child(Boolean is_child) {
        this.is_child = is_child;
    }

    public Boolean getIs_electronic_prescription() {
        return is_electronic_prescription;
    }

    public void setIs_electronic_prescription(Boolean is_electronic_prescription) {
        this.is_electronic_prescription = is_electronic_prescription;
    }

    public Boolean getIs_cito() {
        return is_cito;
    }

    public void setIs_cito(Boolean is_cito) {
        this.is_cito = is_cito;
    }

    public String getNumber_prescription() {
        return number_prescription;
    }

    public void setNumber_prescription(String number_prescription) {
        this.number_prescription = number_prescription;
    }

    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }

    public Integer getCount_day() {
        return count_day;
    }

    public void setCount_day(Integer count_day) {
        this.count_day = count_day;
    }

    public String getPatient_address() {
        return address_patient;
    }

    public void setPatient_address(String patient_address) {
        this.address_patient = patient_address;
    }

    public String getQr_code() {
        return qr_code;
    }

    public void setQr_code(Boolean is_electronic_prescription, String qr_code) {
        if(is_electronic_prescription)
            this.qr_code = qr_code;
        else
            this.qr_code=null;
    }

}
