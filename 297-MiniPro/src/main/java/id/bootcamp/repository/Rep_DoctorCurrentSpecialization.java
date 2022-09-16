package id.bootcamp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import id.bootcamp.dto.DoctorCurrentSpecializationData;
import id.bootcamp.model.T_CurrentDoctorSpeacialization;

@Repository
public interface Rep_DoctorCurrentSpecialization extends JpaRepository<T_CurrentDoctorSpeacialization, Long>{
	
	@Query(nativeQuery = true)
	public List<DoctorCurrentSpecializationData> getAllDoctorsSpecializations();
}
