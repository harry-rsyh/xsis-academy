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
	
	public List<DoctorDto> getAllDoctorDto(){
//		doctor.getAllDoctorsDto()
//				.stream()
//				.forEach(data-> doctor.getAllDoctorAndTreatment()
//						.stream()
//						.filter(treatment -> treatment.getDoctorId() == data.getId())
//						.forEach(res -> data.setTreatmentList(res))
//				);
		return doctor.getAllDoctorsDto()
		.stream()
		.map(s -> {
			List<DoctorTreatmentDto> treatment = doctor.getAllDoctorAndTreatment()
					.stream()
					.filter(data -> data.getDoctorId() == s.getId())
					.collect(Collectors.toList());
			DoctorDto dto = new DoctorDto(s, treatment);
			return dto;
		}).collect(Collectors.toList());
//		doctor.getAllDoctorAndTreatment().stream()
//			.forEach(data -> doctor.getAllDoctorsDto().stream()
//							.);
//		
//		doctor.getAllDoctorsDto().stream()
//		.forEach(data -> System.out.println(data.getTreatmentList()));
//		
//		return doctor.getAllDoctorsDto();
	}
	
	public List<DoctorTreatmentDto> getAllDoctorAndTreatment(){
		List<DoctorTreatmentDto> treatment = doctor.getAllDoctorAndTreatment()
				.stream()
				.filter(data -> data.getDoctorId() == 1)
				.collect(Collectors.toList());
		return treatment;
	}
	
	public List<DoctorCurrentSpecializationDto> getAllDoctorAndSpecialization(){
		return doctor.getAllDoctorAndSpecialization();
	}
}
