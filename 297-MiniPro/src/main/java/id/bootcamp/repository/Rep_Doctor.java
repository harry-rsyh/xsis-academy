package id.bootcamp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import id.bootcamp.dto.DoctorData;
import id.bootcamp.model.M_Doctor;

@Repository
public interface Rep_Doctor extends JpaRepository<M_Doctor, Long>{

	@Query(nativeQuery = true)
	public List<DoctorData> getAllDoctors();
}
