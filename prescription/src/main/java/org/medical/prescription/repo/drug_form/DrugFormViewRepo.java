package org.medical.prescription.repo.drug_form;

import org.medical.prescription.domain.drug_form.DrugFormView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DrugFormViewRepo extends JpaRepository<DrugFormView,Integer> {

    @Query(value = "SELECT * FROM drug_form_view WHERE drug_form_view.trade_name=?1",nativeQuery = true)
    List<DrugFormView> findDrugFormViews(String trade_name);

    @Query(value = "SELECT * FROM drug_form_view WHERE drug_form_view.id_drug=?1",nativeQuery = true)
    List<DrugFormView> findDrugFormByDrugId(Integer idDrug);

}
