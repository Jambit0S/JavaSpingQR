package org.medical.prescription.domain.patient;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table
@ToString(of = {
        "id",
        "id_benefit",
        "id_patient",
        "create_date",
        "end_date"
})
@EqualsAndHashCode(of = {"id"})
@Getter
public class PatientBenefit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer id_benefit;
    private Integer id_patient;
    private String create_date;
    private String end_date;
}
