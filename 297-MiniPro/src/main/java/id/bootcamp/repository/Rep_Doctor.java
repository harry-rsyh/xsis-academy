package id.bootcamp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import id.bootcamp.dto.DoctorCurrentSpecializationDto;
import id.bootcamp.dto.DoctorDto;
import id.bootcamp.dto.DoctorTreatmentDto;
import id.bootcamp.model.M_Doctor;

@Repository
public interface Rep_Doctor extends JpaRepository<M_Doctor, Long>{
	
	@Query(name = "getAllDoctorsDto" ,value = "SELECT new id.bootcamp.dto.DoctorDto(d.id, d.str, b.fullname, b.mobile_phone, b.image_path, d.isDelete) "
			+ "FROM M_Doctor d "
			+ "LEFT JOIN M_Biodata b "
			+ "ON d.biodata_id = b.id")
	public List<DoctorDto> getAllDoctorsDto();
	
	@Query(value = "SELECT new id.bootcamp.dto.DoctorTreatmentDto(dt.id, dc.id, bd.fullname, dt.name, dt.isDelete) "
			+ "FROM M_Doctor dc "
			+ "LEFT JOIN M_Biodata bd "
			+ "ON dc.biodata_id = bd.id "
			+ "LEFT JOIN T_DoctorTreatment dt "
			+ "ON dt.doctor_id = dc.id")
	public List<DoctorTreatmentDto> getAllDoctorAndTreatment();
	
	@Query(value = "SELECT new id.bootcamp.dto.DoctorCurrentSpecializationDto"
			+ "(dcs.id, dc.id, bd.fullname, dcs.specialization_id, sp.name, dcs.isDelete) "
			+ "FROM M_Doctor dc "
			+ "LEFT JOIN M_Biodata bd ON dc.biodata_id = bd.id "
			+ "LEFT JOIN T_DoctorCurrentSpecialization dcs ON dcs.doctor_id = dc.id "
			+ "LEFT JOIN M_Specialization sp ON dcs.specialization_id = sp.id")
	public List<DoctorCurrentSpecializationDto> getAllDoctorAndSpecialization();
}
