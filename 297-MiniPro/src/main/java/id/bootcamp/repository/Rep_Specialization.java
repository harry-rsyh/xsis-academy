package id.bootcamp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import id.bootcamp.dto.SpecializationData;
import id.bootcamp.model.M_Specialization;


@Repository
public interface Rep_Specialization extends JpaRepository<M_Specialization, Long>{
	
	@Query(nativeQuery = true)
	public List<SpecializationData> getSpecializationList();
}
