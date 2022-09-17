package id.bootcamp.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.bootcamp.dto.LocationData;
import id.bootcamp.repository.Rep_Location;

@Service
@Transactional
public class Svc_Location {
	
	@Autowired
	private Rep_Location repLocation;
	
	public List<LocationData> getAllLocation(){
		return repLocation.getLocationList();
	}
	
	public List<LocationData> getKotaAndKabupaten(){
		return repLocation.getLocationList().stream()
					.filter(data -> data.getLocationLevelId() == 3 || data.getLocationLevelId() == 2)
					.collect(Collectors.toList());
	}
}
