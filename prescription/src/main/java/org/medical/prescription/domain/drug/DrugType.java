package org.medical.prescription.domain.drug;

import lombok.ToString;

import javax.persistence.*;

@Entity
@Table
@ToString(of = {
        "id",
        "name",
        "is_recipe"
})
public class DrugType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Boolean is_recipe;
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
    public Boolean getIs_recipe() {
        return is_recipe;
    }

    public void setIs_recipe(Boolean is_recipe) {
        this.is_recipe = is_recipe;
    }


}
