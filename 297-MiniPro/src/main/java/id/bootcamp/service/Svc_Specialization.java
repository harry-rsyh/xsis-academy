package id.bootcamp.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.bootcamp.dto.SpecializationData;
import id.bootcamp.repository.Rep_Specialization;

@Service
@Transactional
public class Svc_Specialization {
	
	@Autowired
	private Rep_Specialization repSpecialization;
	
	public List<SpecializationData> getSpecializationList(){
		return repSpecialization.getSpecializationList().stream()
					.filter(data -> data.getIsDelete() == false)
					.sorted(Comparator.comparing(SpecializationData::getName, String.CASE_INSENSITIVE_ORDER))
					.collect(Collectors.toList());
	}
}
