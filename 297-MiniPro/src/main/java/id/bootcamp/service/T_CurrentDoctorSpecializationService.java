package id.bootcamp.service;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.bootcamp.dto.DoctorCurrentSpecializationData;
import id.bootcamp.repository.Rep_DoctorCurrentSpecialization;

@Service
@Transactional
public class T_CurrentDoctorSpecializationService {
	
	@Autowired
	private Rep_DoctorCurrentSpecialization repo;
	
	public List<DoctorCurrentSpecializationData> getAllDoctorsSpecializations(){
		return repo.getAllDoctorsSpecializations();
	}
}
