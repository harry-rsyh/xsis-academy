package id.bootcamp.dto;

import java.util.ArrayList;
import java.util.List;

public class DoctorDto {
	private Long id;
	private String str;
	private String name;
	private String mobilePhone;
	private String imagePath;
	private Boolean isDelete;
	private List<DoctorTreatmentDto> treatmentList;

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
	
	public DoctorDto(DoctorDto doctor, List<DoctorTreatmentDto> treatmentList) {
		super();
		this.id = doctor.getId();
		this.str = doctor.getStr();
		this.name = doctor.getName();
		this.mobilePhone = doctor.getMobilePhone();
		this.imagePath = doctor.getImagePath();
		this.isDelete = doctor.getIsDelete();
		this.treatmentList = treatmentList;
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

//	public List<DoctorTreatmentDto> getTreatment() {
//		return treatmentList;
//	}
//
//	public void setTreatment(DoctorTreatmentDto t) {
//		DoctorTreatmentDto data = new DoctorTreatmentDto(t.getId(), t.getDoctorId(), t.getDoctorName(), t.getTreatment(), t.getIsDelete());
////		System.out.println(treatment.getDoctorName());
//		this.treatmentList.add(data);
//	}
	
}
