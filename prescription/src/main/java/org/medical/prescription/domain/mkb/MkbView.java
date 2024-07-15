package org.medical.prescription.domain.mkb;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table
@ToString(of = {
        "id",
        "letter",
        "code",
        "dot_code"
})
@EqualsAndHashCode(of = {"id"})
@Getter
public class MkbView {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String letter;
    private String code;
    private Integer dot_code;
}
