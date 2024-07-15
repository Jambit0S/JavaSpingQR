package org.medical.prescription.controller.drug;

import org.medical.prescription.domain.drug.DrugType;
import org.medical.prescription.repo.drug.DrugTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("drug-type")
public class DrugTypeController {
    private final DrugTypeRepo drugTypeRepo;
    @Autowired
    public DrugTypeController(DrugTypeRepo drugTypeRepo) {
        this.drugTypeRepo = drugTypeRepo;
    }
    @GetMapping
    public List<DrugType> getDrugTypes ()
    {
        return drugTypeRepo.findAll();
    }
    @GetMapping("{id}")
    public DrugType getOneDrugType(@PathVariable("id") DrugType drugType)
    {
        return drugType;
    }

}
