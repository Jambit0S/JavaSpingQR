package org.medical.prescription.controller.drug_form;

import org.medical.prescription.domain.drug_form.Unit;
import org.medical.prescription.domain.drug_form.UnitMetrics;
import org.medical.prescription.repo.drug_form.UnitMetricsRepo;
import org.medical.prescription.repo.drug_form.UnitRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("unit")
public class UnitController {
    private final UnitRepo unitRepo;

    public UnitController(UnitRepo unitRepo) {
        this.unitRepo = unitRepo;
    }

    @GetMapping
    public List<Unit> getUnits(){return unitRepo.findAll();}

    @GetMapping("{id}")
    public Unit getOneUnit(@PathVariable("id") Unit unit)
    {
        return unit;
    }

}

