package org.medical.prescription.controller.drug_form;

import org.medical.prescription.domain.drug_form.DrugFormView;
import org.medical.prescription.repo.drug_form.DrugFormViewRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("drug-form-view")
public class DrugFormViewController {
    private final DrugFormViewRepo drugFormViewRepo;

    public DrugFormViewController(DrugFormViewRepo drugFormViewRepo) {
        this.drugFormViewRepo = drugFormViewRepo;
    }

    @GetMapping
    public List<DrugFormView> getDrugForms()
    {
        return drugFormViewRepo.findAll();
    }
    @GetMapping("{id}")
    public DrugFormView getDrugFormById(@PathVariable("id") DrugFormView drugFormView)
    {
        return drugFormView;
    }
    @GetMapping("drug/{id}")
    public List<DrugFormView> getDrugFormByDrugId(@PathVariable("id") Integer drugId)
    {
        return drugFormViewRepo.findDrugFormByDrugId(drugId);
    }
    @GetMapping("name/{trade_name}")
    public List<DrugFormView> getDrugFormByTradeName(@PathVariable("trade_name") String name)
    {
        return drugFormViewRepo.findDrugFormViews(name);
    }

}
