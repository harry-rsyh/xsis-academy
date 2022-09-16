package id.bootcamp.controller;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import id.bootcamp.dto.DoctorCurrentSpecializationData;
import id.bootcamp.service.T_CurrentDoctorSpecializationService;

@RestController
@RequestMapping("api/currentDoctorSpecialization")
public class DoctorCurrentSpecialization_ResCtr {
	
	@Autowired
	private T_CurrentDoctorSpecializationService service;
	
	@RequestMapping("getList")
	public List<DoctorCurrentSpecializationData> getAllDoctorsSpecializations(){
		return service.getAllDoctorsSpecializations().stream()
			   .sorted(Comparator.comparing(DoctorCurrentSpecializationData::getDoctorName, String.CASE_INSENSITIVE_ORDER))
			   .collect(Collectors.toList());
	}
}
