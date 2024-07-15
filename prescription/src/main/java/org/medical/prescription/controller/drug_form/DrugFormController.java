package org.medical.prescription.controller.drug_form;

import org.medical.prescription.domain.drug_form.DrugForm;
import org.medical.prescription.repo.drug_form.DrugFormRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("drug-form")
public class DrugFormController {
    private final DrugFormRepo drugFormRepo;

    public DrugFormController(DrugFormRepo drugFormRepo) {
        this.drugFormRepo = drugFormRepo;
    }

    @GetMapping
    public List<DrugForm> getDrugForms()
    {
        return drugFormRepo.findAll();
    }
    @GetMapping("{id}")
    public DrugForm getOneDrugForm(@PathVariable("id") DrugForm drugForm)
    {
        return drugForm;
    }

}
