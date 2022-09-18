package id.bootcamp.dto;

import java.util.List;

public class DoctorDto {
	private Long id;
	private String str;
	private String name;
	private String mobilePhone;
	private String imagePath;
	private Boolean isDelete;
	private List<DoctorTreatmentDto> treatmentList;
	private List<DoctorCurrentSpecializationDto> specializationList;

	public DoctorDto() {
		// TODO Auto-generated constructor stub
	}

	public DoctorDto(Long id, String str, String name, String mobilePhone, String imagePath, Boolean isDelete) {
		super();
		this.id = id;
		this.str = str;
		this.name = name;
		this.mobilePhone = mobilePhone;
		this.imagePath = imagePath;
		this.isDelete = isDelete;
	}
	
	//Di inject dari M_DoctorServie
	public DoctorDto(DoctorDto doctor, List<DoctorTreatmentDto> treatmentList, List<DoctorCurrentSpecializationDto> specializationList) {
		super();
		this.id = doctor.getId();
		this.str = doctor.getStr();
		this.name = doctor.getName();
		this.mobilePhone = doctor.getMobilePhone();
		this.imagePath = doctor.getImagePath();
		this.isDelete = doctor.getIsDelete();
		this.treatmentList = treatmentList;
		this.specializationList = specializationList;
	}
	
	
	/*
	 * Nama yang ditampilkan di api adalah setelah Get
	 * ex getId maka id
	 * jika mau edit nama cukup di getter dan setter nya aja
	 * contoh getId ditukar jadi getDoctorId
	 * tapi, return nya sesuai dengan properties yang dibuat
	 * constoh
	 * 
	 * private Long id;
	 * public Long getDoctorId(){
	 * 		return id;
	 * }
	 * 
	 */

	public Long getId() {
		return id;
	}

	public String getStr() {
		return str;
	}

	public String getName() {
		return name;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public String getImagePath() {
		return imagePath;
	}

	public Boolean getIsDelete() {
		return isDelete;
	}

	public List<DoctorTreatmentDto> getTreatmentList() {
		return treatmentList;
	}

	public void setTreatmentList(DoctorTreatmentDto treatmentList) {
		this.treatmentList.add(treatmentList);
	}

	public List<DoctorCurrentSpecializationDto> getSpecializationList() {
		return specializationList;
	}

	public void setSpecializationList(DoctorCurrentSpecializationDto specializationList) {
		this.specializationList.add(specializationList);
	}
	
}
