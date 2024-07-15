package org.medical.prescription.controller.prescription;

import org.medical.prescription.domain.prescription.Doctor;
import org.medical.prescription.repo.prescription.DoctorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/doctor")
public class DoctorController {
    private final DoctorRepo doctorRepo;

    @Autowired
    public DoctorController(DoctorRepo doctorRepo) {
        this.doctorRepo = doctorRepo;
    }

    @GetMapping
    public List<Doctor> getDoctors()
    {
        return doctorRepo.findAll();
    }

    @GetMapping("{id}")
    public Doctor getOneDoctor(@PathVariable("id") Doctor doctor)
    {
        return doctor;
    }
    /*@PostMapping()
    public Doctor create(@RequestBody Doctor doctor)
    {
        return doctorRepo.save(doctor);
    }
    @PostMapping("/auth")
    public List<Doctor> auth(@RequestBody Doctor doctor)
    {
        return doctorRepo.findAll().stream().filter(
                element->doctor.getLogin().equals(element.getLogin())&&
                        doctor.getPass().equals(element.getPass())).collect(Collectors.toList());
    }
    @PutMapping("{id}")
    public Doctor update(
            @PathVariable("id") Doctor doctorFromDb,
            @RequestBody Doctor doctor // Doctor from user
    )
    {
        BeanUtils.copyProperties(doctor,doctorFromDb,"id");
        // Берем данные из doctors и кладем их в doctorFromDb
        // Кроме поля id

        return doctorRepo.save(doctor);
    }
    @DeleteMapping("{id}") // Оставшийся crud
    public void delete(@PathVariable("id") Doctor doctor)
    {
        doctorRepo.delete(doctor);
    }*/

}
