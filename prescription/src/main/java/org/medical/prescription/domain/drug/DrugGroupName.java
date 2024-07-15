package org.medical.prescription.domain.drug;

import lombok.ToString;

import javax.persistence.*;

@Entity
@Table
@ToString(of = {
        "id",
        "name"
})
public class DrugGroupName {
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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
}
