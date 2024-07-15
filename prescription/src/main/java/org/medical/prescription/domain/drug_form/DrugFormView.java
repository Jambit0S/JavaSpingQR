package org.medical.prescription.domain.drug_form;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table
@ToString(of ={
        "id",
        "id_drug",
        "form",
        "mass_mg",
        "first_package",
        "second_package",
        "trade_name"
})
@Getter
public class DrugFormView {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer id_drug;
    private String form;
    private Integer mass_mg;
    private Integer first_package;
    private Integer second_package;
    private String trade_name;
}
