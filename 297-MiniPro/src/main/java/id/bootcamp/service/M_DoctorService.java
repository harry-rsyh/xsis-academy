package id.bootcamp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.bootcamp.dto.DoctorData;
import id.bootcamp.repository.Rep_Doctor;

@Service
@Transactional
public class M_DoctorService {
	
	@Autowired
	private Rep_Doctor doctor;
	
	public List<DoctorData> getAllDoctors(){
		return doctor.getAllDoctors();
	}
}
