package org.medical.prescription.domain.drug_form;

import lombok.ToString;

import javax.persistence.*;

@Entity
@Table
@ToString(of = {
        "id",
        "id_unit_metrics",
        "id_medical_form"
})
public class Unit {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public Integer getId_unit_metrics() {
        return id_unit_metrics;
    }

    public void setId_unit_metrics(Integer id_unit_metrics) {
        this.id_unit_metrics = id_unit_metrics;
    }

    public Integer getId_medical_form() {
        return id_medical_form;
    }

    public void setId_medical_form(Integer id_medical_form) {
        this.id_medical_form = id_medical_form;
    }

    private Integer id_unit_metrics;
    private Integer id_medical_form;
}
