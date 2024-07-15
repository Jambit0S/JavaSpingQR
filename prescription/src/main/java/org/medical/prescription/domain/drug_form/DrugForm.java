package org.medical.prescription.domain.drug_form;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table
@ToString(of ={
        "id",
        "id_drug",
        "id_unit",
        "id_drug_insertion",
        "mass_mg",
        "first_package",
        "second_package"
})
@Getter
public class DrugForm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer id_drug;
    private Integer id_unit;
    private Integer id_drug_insertion;
    private Integer mass_mg;
    private Integer first_package;//Количество доз в "плашке"
    private Integer second_package;//Количество плашек



}
