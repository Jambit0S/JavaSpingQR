package org.medical.prescription.controller.drug;

import org.medical.prescription.domain.drug.Drug;
import org.medical.prescription.repo.drug.DrugRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("drug")
public class DrugController {
    public DrugController(DrugRepo drugRepo) {
        this.drugRepo = drugRepo;
    }

    private final DrugRepo drugRepo;

    @GetMapping
    public List<Drug> getDrugs(){return drugRepo.findAll();}

    @GetMapping("{id}")
    public Drug getOneDrug(@PathVariable("id")Drug drug)
    {
        return drug;
    }
    @GetMapping("name/{name}")
    public List<Drug> getDrugsByName(@PathVariable("name")String name){
        return drugRepo.findDrugByName(name);
    }
    @GetMapping("is-narcotic/{id}")
    public boolean isNarcoticByDrugId(@PathVariable("id") Drug drug){
        if(drug.getId_drug_type()>1)
            return true;
        else
            return false;
    }
}