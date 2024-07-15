package org.medical.prescription.controller.patient;

import org.medical.prescription.domain.patient.Patient;
import org.medical.prescription.domain.patient.RecordsOrder;
import org.medical.prescription.exceptions.NotFoundEsception;
import org.medical.prescription.repo.patient.RecordsOrderRepo;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("records-order")
public class RecordsOrderController {
    private final RecordsOrderRepo recordsOrderRepo;
    public RecordsOrderController(RecordsOrderRepo recordsOrderRepo) {
        this.recordsOrderRepo = recordsOrderRepo;
    }

    @GetMapping()
    public List<RecordsOrder> getRecordsOrders()
    {
        return recordsOrderRepo.findAll();
    }
    @GetMapping("{id}")
    public RecordsOrder getOneRecordOrder(@PathVariable("id") RecordsOrder recordsOrder)
    {
        return recordsOrder;
    }
    @GetMapping("/date")
    public String getTodayDate()
    {
        return LocalDate.now().toString();
        //return  "2023-04-25 00:00:00".substring(0,10);
    }
    @GetMapping("/last/{count}")
    public List<RecordsOrder> getLastRecordsOrders(@PathVariable("count")int count)
    {
        List<RecordsOrder> records = recordsOrderRepo.findAll();
        return records.subList(records.size()-count,records.size());
    }
    @GetMapping("/filter-today")
    public List<RecordsOrder> findRecordsOrdersToday()
    {
        return recordsOrderRepo.findAll().
                stream().
                filter(element ->
                        //element.getDate_time_record().substring(0,10).equals("2023-04-25"))
                        element.getDate_time_record().substring(0,10).equals(LocalDate.now().toString()))
                .collect(Collectors.toList());
    }

    @GetMapping("filter-period/{first}/{second}")
    public List<RecordsOrder> findRecordsOrdersPatients(
            @PathVariable("first")String datest,
            @PathVariable("second")String dateed)
    {
        LocalDate date_start = LocalDate.parse(datest);
        LocalDate date_end = LocalDate.parse(dateed);

        return recordsOrderRepo.findAll().
                stream().
                filter(
                        element->
                                LocalDate.parse(element.getDate_time_record().substring(0,10)).isAfter(date_start)&&
                                        LocalDate.parse(element.getDate_time_record().substring(0,10)).isBefore(date_end)
                ).collect(Collectors.toList());

    }


//    @GetMapping("filter-pereiod/{datest,dateed}")
//    public List<RecordsOrder> findRecordsOrdersPatients(
//            @PathVariable("datest")String datest,
//            @PathVariable("dateed")String dateed,
//            @RequestBody List<Patient> patients)
//    {
//        LocalDate date_start = LocalDate.parse(datest);
//        LocalDate date_end = LocalDate.parse(dateed);
//
//        List<RecordsOrder> recordsDataFiltred =recordsOrderRepo.findAll().
//                stream().
//                filter(
//                        elemet->
//                                LocalDate.parse(elemet.getDate_time_record()).isAfter(date_start)&&
//                                        LocalDate.parse(elemet.getDate_time_record()).isBefore(date_end)
//                ).collect(Collectors.toList());
//        patients.stream().filter(
//                element->
//        )
//    }

//    public List<Patient> findRecordsOrderByFirstName(String fname)
//    {
//        PatientController controller = null;
//        return controller.getPatientsByFirstName(fname);
//    }
}
