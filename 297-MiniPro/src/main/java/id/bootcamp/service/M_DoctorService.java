package id.bootcamp.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.bootcamp.dto.DoctorCurrentSpecializationDto;
import id.bootcamp.dto.DoctorDto;
import id.bootcamp.dto.DoctorTreatmentDto;
import id.bootcamp.repository.Rep_Doctor;

@Service
@Transactional
public class M_DoctorService {

	@Autowired
	private Rep_Doctor doctor;

	public List<DoctorDto> getAllDoctorDto() {
		List<DoctorDto> result = doctor.getAllDoctorsDto().stream().map(s -> {
			// Doctor Treatment
			List<DoctorTreatmentDto> treatment = doctor.getAllDoctorAndTreatment().stream()
					.filter(data -> data.getDoctorId() == s.getId()).collect(Collectors.toList());
			
			// Doctor Specialization
			List<DoctorCurrentSpecializationDto> specialization = doctor.getAllDoctorAndSpecialization().stream()
					.filter(data -> data.getDoctorId() == s.getId()).collect(Collectors.toList());
			
			// Inject Kedalam Constructor
			DoctorDto dto = new DoctorDto(s, treatment, specialization);
			
			// Kembalikan hasil map nya kebentuk Doctor Dto
			return dto;
		}).collect(Collectors.toList());

		return result;
	}

	public List<DoctorTreatmentDto> getAllDoctorAndTreatment() {
		List<DoctorTreatmentDto> treatment = doctor.getAllDoctorAndTreatment().stream()
				.filter(data -> data.getDoctorId() == 1).collect(Collectors.toList());
		return treatment;
	}

	public List<DoctorCurrentSpecializationDto> getAllDoctorAndSpecialization() {
		return doctor.getAllDoctorAndSpecialization();
	}
}
