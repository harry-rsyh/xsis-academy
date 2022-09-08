package id.bootcamp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("education_level")
public class EducationLevel_Controller {
	
	@RequestMapping
	public String educationLevel() {
		return "education_level/education_level.html";
	}
}
