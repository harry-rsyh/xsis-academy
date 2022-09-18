package id.bootcamp.dto;

public class DoctorCurrentSpecializationDto {
	private Long id;
	private Long doctorId;
//	private String doctorName;
	private Long specializationId;
	private String specializationName;
	private Boolean isDelete;
	
	public DoctorCurrentSpecializationDto() {
		// TODO Auto-generated constructor stub
	}

	public DoctorCurrentSpecializationDto(Long id, Long doctorId, Long specializationId, String specializationName,
			Boolean isDelete) {
		super();
		this.id = id;
		this.doctorId = doctorId;
		this.specializationId = specializationId;
		this.specializationName = specializationName;
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

	public Long getSpecializationId() {
		return specializationId;
	}

	public void setSpecializationId(Long specializationId) {
		this.specializationId = specializationId;
	}

	public String getSpecializationName() {
		return specializationName;
	}

	public void setSpecializationName(String specializationName) {
		this.specializationName = specializationName;
	}

	public Boolean getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Boolean isDelete) {
		this.isDelete = isDelete;
	}
	

//	public DoctorCurrentSpecializationDto(Long id, Long doctorId, String doctorName, Long specializationId,
//			String specializationName, Boolean isDelete) {
//		super();
//		this.id = id;
//		this.doctorId = doctorId;
//		this.doctorName = doctorName;
//		this.specializationId = specializationId;
//		this.specializationName = specializationName;
//		this.isDelete = isDelete;
//	}

//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public Long getDoctorId() {
//		return doctorId;
//	}
//
//	public void setDoctorId(Long doctorId) {
//		this.doctorId = doctorId;
//	}
//
//	public String getDoctorName() {
//		return doctorName;
//	}
//
//	public void setDoctorName(String doctorName) {
//		this.doctorName = doctorName;
//	}
//
//	public Long getSpecializationId() {
//		return specializationId;
//	}
//
//	public void setSpecializationId(Long specializationId) {
//		this.specializationId = specializationId;
//	}
//
//	public String getSpecializationName() {
//		return specializationName;
//	}
//
//	public void setSpecializationName(String specializationName) {
//		this.specializationName = specializationName;
//	}
//
//	public Boolean getIsDelete() {
//		return isDelete;
//	}
//
//	public void setIsDelete(Boolean isDelete) {
//		this.isDelete = isDelete;
//	}
	
}
