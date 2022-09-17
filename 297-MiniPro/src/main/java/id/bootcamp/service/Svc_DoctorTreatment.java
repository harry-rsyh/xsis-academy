package id.bootcamp.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.bootcamp.dto.DoctorTreatmentData;
import id.bootcamp.repository.Rep_DoctorTreatment;

@Service
@Transactional
public class Svc_DoctorTreatment {

	@Autowired
	private Rep_DoctorTreatment repDoctorTreatment;
	
	public List<DoctorTreatmentData> getTreatmentList(){
		return repDoctorTreatment.getTreatmentList()
				.stream()
				.sorted(Comparator.comparing(DoctorTreatmentData::getName, String.CASE_INSENSITIVE_ORDER))
				.collect(Collectors.toList());
	}
}
