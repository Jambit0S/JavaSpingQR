package org.medical.prescription.controller.drug_form;

import org.medical.prescription.domain.drug_form.DrugInsertion;
import org.medical.prescription.repo.drug_form.DrugInsertionRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("drug-insertion")
public class DrugInsertionCotroller {
    private final DrugInsertionRepo drugInsertionRepo;

    public DrugInsertionCotroller(DrugInsertionRepo drugInsertionRepo) {
        this.drugInsertionRepo = drugInsertionRepo;
    }

    @GetMapping
    public List<DrugInsertion> getDrugInsertions(){return drugInsertionRepo.findAll();}

    @GetMapping("{id}")
    public DrugInsertion getOneDrugInsertion(@PathVariable("id") DrugInsertion drugInsertion)
    {
        return drugInsertion;
    }

}

