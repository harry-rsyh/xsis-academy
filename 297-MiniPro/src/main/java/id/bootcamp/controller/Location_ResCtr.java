package id.bootcamp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import id.bootcamp.dto.LocationData;
import id.bootcamp.model.M_Location;
import id.bootcamp.service.Svc_Location;

@RestController
@RequestMapping("api/location")
public class Location_ResCtr {
	
	@Autowired
	private Svc_Location svcLocation;
	
	@RequestMapping("getList")
	public List<LocationData> getAllLocation(){
		return svcLocation.getAllLocation();
	}
	
	@RequestMapping("getKotaAndKabupaten")
	public List<LocationData> getKotaAndKabupaten(){
		return svcLocation.getKotaAndKabupaten();
	}
}