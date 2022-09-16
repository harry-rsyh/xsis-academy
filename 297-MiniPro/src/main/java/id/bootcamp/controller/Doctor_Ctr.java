package id.bootcamp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("doctor")
public class Doctor_Ctr {
	
	@RequestMapping("find")
	public String doctorFindHome() {
		return "doctor/doctor_find";
	}
}
