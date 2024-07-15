package org.medical.prescription.controller.drug;

import org.medical.prescription.domain.drug.DrugGroup;
import org.medical.prescription.repo.drug.DrugGroupRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("drug-group")
public class    DrugGroupController {
    private final DrugGroupRepo drugGroupRepo;
    @Autowired
    public DrugGroupController(DrugGroupRepo drugGroupRepo) {
        this.drugGroupRepo = drugGroupRepo;
    }
    @GetMapping
    public List<DrugGroup> getDrugGroups ()
    {
        return drugGroupRepo.findAll();
    }
    @GetMapping("{id}")
    public DrugGroup getOneDrugGroup(@PathVariable("id") DrugGroup drugGroup)
    {
        return drugGroup;

    }

}
