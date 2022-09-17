package id.bootcamp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import id.bootcamp.dto.DoctorTreatmentData;
import id.bootcamp.service.Svc_DoctorTreatment;

@RestController
@RequestMapping("api/doctorTreatment")
public class DoctorTreatment_ResCtr {
	
	@Autowired
	private Svc_DoctorTreatment svcDoctorTreatment;
	
	@RequestMapping("getList")
	public List<DoctorTreatmentData> getTreatmentList(){
		return svcDoctorTreatment.getTreatmentList();
	}
}
