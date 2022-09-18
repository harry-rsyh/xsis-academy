package id.bootcamp.dto;

public class DoctorTreatmentDto {
	private Long id;
	private Long doctorId;
	private String doctorName;
	private String treatment;
	private Boolean isDelete;

	public DoctorTreatmentDto() {
		// TODO Auto-generated constructor stub
	}

	public DoctorTreatmentDto(Long id, Long doctorId, String doctorName, String treatment, Boolean isDelete) {
		super();
		this.id = id;
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.treatment = treatment;
		this.isDelete = isDelete;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public void setDoctorName(String doctor_name) {
		this.doctorName = doctor_name;
	}

	public String getTreatment() {
		return treatment;
	}

	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}

	public Boolean getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Boolean isDelete) {
		this.isDelete = isDelete;
	}

}
