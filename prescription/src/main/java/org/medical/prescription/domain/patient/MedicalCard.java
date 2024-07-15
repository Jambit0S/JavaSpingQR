package org.medical.prescription.domain.patient;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table
@ToString(of = {
        "id",
        "id_patient"
})
@EqualsAndHashCode(of = {"id"})
@Getter
public class MedicalCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer id_patient;
}
