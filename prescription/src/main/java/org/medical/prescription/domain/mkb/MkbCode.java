package org.medical.prescription.domain.mkb;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table
@ToString(of = {
        "id",
        "name",
        "code",
        "id_mkb_letter"
})
@EqualsAndHashCode(of = {"id"})
public class MkbCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String code;
    private Integer id_mkb_letter;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getId_mkb_letter() {
        return id_mkb_letter;
    }

    public void setId_mkb_letter(Integer id_mkb_letter) {
        this.id_mkb_letter = id_mkb_letter;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
