package org.medical.prescription.domain.mkb;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table
@ToString(of = {
        "id",
        "name",
        "dot_code",
        "id_mkb_code"
})
@EqualsAndHashCode(of = {"id"})
public class MkbDotCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String dot_code;
    private Integer id_mkb_code;

    public String getDot_code() {
        return dot_code;
    }

    public void setDot_code(String dot_code) {
        this.dot_code = dot_code;
    }

    public Integer getId_mkb_code() {
        return id_mkb_code;
    }

    public void setId_mkb_code(Integer id_mkb_code) {
        this.id_mkb_code = id_mkb_code;
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
