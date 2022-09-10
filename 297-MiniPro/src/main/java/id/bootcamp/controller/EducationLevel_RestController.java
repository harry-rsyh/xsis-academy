package id.bootcamp.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import id.bootcamp.model.M_EducationalLevel;
import id.bootcamp.service.M_EducationalLevelService;

@RestController
@RequestMapping("api/educationLevel")
public class EducationLevel_RestController {

	@Autowired
	private M_EducationalLevelService edlService;

	// Get All Educational Level | Include deleted level
	@GetMapping("getAllLevel")
	public List<M_EducationalLevel> getAllLevel() {
		return edlService.getAllLevel();
	}

	// Get All Educational Level | except deleted level
	@GetMapping("getAllNotDeleted")
	public List<M_EducationalLevel> getAllNotDeleted() {
		return edlService.getAllNotDeleted();
	}

	// Get All Educational Level | only deleted level
	@GetMapping("getAllDeleted")
	public List<M_EducationalLevel> getAllDeleted() {
		return edlService.getAllDeleted();
	}

	// Get By Id
	@GetMapping("getById/{id}")
	public M_EducationalLevel getById(@PathVariable("id") Long id) {
		return edlService.getById(id);
	}

	// Get All by Same name | ignoring case sensitive
	@GetMapping("getByName")
	public List<M_EducationalLevel> getByName(@RequestParam(name = "name") String name) {
		return edlService.getByName(name);
	}

	// Get All by Same name | ignoring case sensitive
	@GetMapping("getByNameIgnoreCase")
	public List<M_EducationalLevel> getByNameIgnoreCase(@RequestParam(name = "name") String name) {
		return edlService.getByNameIgnoreCase(name);
	}

	// Get All by keyword
	@GetMapping("getByKeyword")
	public List<M_EducationalLevel> getByKeyword(@RequestParam(name = "key") String name) {
		return edlService.getByKeyword(name);
	}

	// Add new Level
	@PostMapping("addLevel")
	public String addLevel(@RequestBody M_EducationalLevel mEdl) {

		// Validate Name not empty string
		if (mEdl.getName().toString().equals("")) {
			return "name shouldn't empty!";
		}
		
		// Validate name existing | case sensitif
		if(edlService.duplicateName(mEdl.getName().toString())) {
			return "Name Already Exist";
		}
		
		mEdl.setCreated_by(1L);
		mEdl.setCreated_on(new Date());
		
		edlService.saveLevel(mEdl);
		return "ok";
	}
	
	// Edit Level Name
	@PutMapping("editLevel")
	public String editLevel(@RequestBody M_EducationalLevel newEdl) {
		// EducationLevel id shouldn't empty
		Long idLevel = newEdl.getId();
		if(idLevel == null) {
			return "Level Id Shouldn't Empty";
		}
		
		// Get Old Object Data
		M_EducationalLevel oldEdl = edlService.getById(idLevel);
		
		// Validate Old EducationLevel already exist
		if(oldEdl == null) {
			return "404 - ID Not Found";
		}
		
		// Validate Name not Duplicated
		String oldName = oldEdl.getName();
		String newName = newEdl.getName();
		
		// allow user save old name
		if(!oldName.equals(newName)) {
			// check duplicate name
			if(edlService.duplicateName(newName)) {
				return "Name Already Exist";
			}
		}
		
		newEdl.setCreated_by(oldEdl.getCreated_by());
		newEdl.setCreated_on(oldEdl.getCreated_on());
		
		newEdl.setModified_by(1L);
		newEdl.setModified_on(new Date());
		
		edlService.saveLevel(newEdl);
		return "ok";
	}
	
	// Edit Level Name
	@DeleteMapping("deleteLevel/{id}")
	public String deleteLevel(@PathVariable("id") Long idLevel) {
		M_EducationalLevel edlModel = edlService.getById(idLevel);
		
		// Validate Old EducationLevel already exist
		if(edlModel == null) {
			return "404 - ID Not Found";
		}
		
		edlModel.setDeleted_by(1L);
		edlModel.setDeleted_on(new Date());
		edlModel.setIs_delete(true);
		
		edlService.saveLevel(edlModel);
		
		return "ok";
	}

}
