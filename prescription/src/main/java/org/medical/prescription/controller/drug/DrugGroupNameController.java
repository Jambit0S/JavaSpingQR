package org.medical.prescription.controller.drug;

import org.medical.prescription.domain.drug.DrugGroupName;
import org.medical.prescription.repo.drug.DrugGroupNameRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("drug-group-name")
public class DrugGroupNameController {
    private final DrugGroupNameRepo drugGroupNameRepo;
    @Autowired
    public DrugGroupNameController(DrugGroupNameRepo drugGroupNameRepo) {
        this.drugGroupNameRepo = drugGroupNameRepo;
    }
    @GetMapping
    public List<DrugGroupName> getDrugGroupNames ()
    {
        return drugGroupNameRepo.findAll();
    }
    @GetMapping("{id}")
    public DrugGroupName getOneDrugGroupName(@PathVariable("id") DrugGroupName drugGroupName)
    {
        return drugGroupName;

    }

}
