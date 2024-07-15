package org.medical.prescription.domain.drug;

import lombok.ToString;

import javax.persistence.*;

@Entity
@Table
@ToString(of = {
        "id",
        "id_drug_type",
        "chemical_name",
        "mnm"
})
public class Drug {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer id_drug_type;
    private String chemical_name;
    private String mnm;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_drug_type() {
        return id_drug_type;
    }

    public void setId_drug_type(Integer id_drug_type) {
        this.id_drug_type = id_drug_type;
    }

    public String getChemical_name() {
        return chemical_name;
    }

    public void setChemical_name(String chemical_name) {
        this.chemical_name = chemical_name;
    }

    public String getMnm() {
        return mnm;
    }

    public void setMnm(String mnm) {
        this.mnm = mnm;
    }
}
