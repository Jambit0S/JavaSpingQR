package org.medical.prescription.domain.drug;

import lombok.ToString;

import javax.persistence.*;

@Entity
@Table
@ToString(of = {
        "id",
        "id_drug_group_name",
        "id_drug"
})
public class DrugGroup {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_drug_group_name() {
        return id_drug_group_name;
    }

    public void setId_drug_group_name(Integer id_drug_group_name) {
        this.id_drug_group_name = id_drug_group_name;
    }

    public Integer getId_drug() {
        return id_drug;
    }

    public void setId_drug(Integer id_drug) {
        this.id_drug = id_drug;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer id_drug_group_name;
    private Integer id_drug;

}
