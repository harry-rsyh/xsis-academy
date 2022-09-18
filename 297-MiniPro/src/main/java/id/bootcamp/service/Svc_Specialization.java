package id.bootcamp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.bootcamp.dto.DoctorCurrentSpecializationDto;
import id.bootcamp.repository.Rep_Specialization;

@Service
@Transactional
public class Svc_Specialization {
	
	@Autowired
	private Rep_Specialization repSpecialization;
	
	public List<DoctorCurrentSpecializationDto> getSpecializationList(){
		return repSpecialization.getSpecializationList();
	}
}
