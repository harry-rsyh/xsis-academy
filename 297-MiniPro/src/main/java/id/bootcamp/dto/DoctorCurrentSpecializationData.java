package id.bootcamp.dto;

public class DoctorCurrentSpecializationData {
	Long id;
	Long biodataId;
	Long doctorId;
	String doctorName;
	Long specializationId;
	String specialization;
	
	public DoctorCurrentSpecializationData() {
		// TODO Auto-generated constructor stub
	}
	
	

	public DoctorCurrentSpecializationData(Long id, Long biodataId, Long doctorId, String doctorName,
			Long specializationId, String specialization) {
		this.id = id;
		this.biodataId = biodataId;
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.specializationId = specializationId;
		this.specialization = specialization;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getBiodataId() {
		return biodataId;
	}

	public void setBiodataId(Long biodataId) {
		this.biodataId = biodataId;
	}


	public Long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Long doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public Long getSpecializationId() {
		return specializationId;
	}

	public void setSpecializationId(Long specializationId) {
		this.specializationId = specializationId;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
}
