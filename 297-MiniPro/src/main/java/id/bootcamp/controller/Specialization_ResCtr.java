package id.bootcamp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import id.bootcamp.dto.SpecializationData;
import id.bootcamp.service.Svc_Specialization;

@RestController
@RequestMapping("api/specialization")
public class Specialization_ResCtr {
	
	@Autowired
	private Svc_Specialization svcSpecialization;
	
	@RequestMapping("getList")
	public List<SpecializationData> getSpecializationList(){
		return svcSpecialization.getSpecializationList();
	}
}
