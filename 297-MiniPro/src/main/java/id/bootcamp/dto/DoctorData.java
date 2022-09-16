package id.bootcamp.dto;

public class DoctorData {
	private Long id;
	private String name;
	private String str;
	private String mobilePhone;
	private String imagePath;
	
	public DoctorData() {
		// TODO Auto-generated constructor stub
	}
	
	public DoctorData(Long id, String name, String str, String mobilePhone, String imagePath) {
		this.id = id;
		this.name = name;
		this.str = str;
		this.mobilePhone = mobilePhone;
		this.imagePath = imagePath;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
}
