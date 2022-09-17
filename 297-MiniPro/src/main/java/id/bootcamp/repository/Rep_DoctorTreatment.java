package id.bootcamp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import id.bootcamp.dto.DoctorTreatmentData;
import id.bootcamp.model.T_DoctorTreatment;


@Repository
public interface Rep_DoctorTreatment extends JpaRepository<T_DoctorTreatment, Long>{
	
	@Query(nativeQuery = true)
	public List<DoctorTreatmentData> getTreatmentList();
}
