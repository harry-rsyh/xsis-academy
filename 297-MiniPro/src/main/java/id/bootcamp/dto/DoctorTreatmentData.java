package id.bootcamp.dto;

public class DoctorTreatmentData {
	
	private Long id;
	private String name;
	
	public DoctorTreatmentData() {
		// TODO Auto-generated constructor stub
	}

	public DoctorTreatmentData(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
}
