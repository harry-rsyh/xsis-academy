package id.bootcamp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import id.bootcamp.dto.DoctorData;
import id.bootcamp.dto.DoctorDto;
import id.bootcamp.dto.DoctorTreatmentDto;
import id.bootcamp.service.M_DoctorService;

@RestController
@RequestMapping("api/doctor")
public class Doctor_ResCtr {
	
	@Autowired
	private M_DoctorService service;
	
	@RequestMapping("getList")
	public List<DoctorData> getAllDoctors(){
		return service.getAllDoctors();
	}
	
	@RequestMapping("getListDto")
	public List<DoctorDto> getAllDoctorDto(){
		return service.getAllDoctorDto();
	}
	
	@RequestMapping("getListTreatmentDto")
	public List<DoctorTreatmentDto> getAllDoctorAndTreatment(){
		return service.getAllDoctorAndTreatment();
	}
}
