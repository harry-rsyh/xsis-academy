package id.bootcamp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.bootcamp.dto.LocationSpesificData;
import id.bootcamp.repository.Rep_Location;

@Service
@Transactional
public class Svc_Location {
	
	@Autowired
	private Rep_Location repLocation;
	
	public List<LocationSpesificData> getAllLocation(){
		return repLocation.getLocationList();
	}
	
	public List<LocationSpesificData> getKecamatanList(){
		return repLocation.getKecamatanList();
	}
	
	public List<LocationSpesificData> getKabKotaList(){
		return repLocation.getKabKotaList();
	}

}
