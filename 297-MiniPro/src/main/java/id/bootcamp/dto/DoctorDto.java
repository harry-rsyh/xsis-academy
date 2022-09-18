package id.bootcamp.dto;

public class DoctorDto {
	private Long id;
	private String str;
	private String name;
	private String mobilePhone;
	private String imagePath;
	
	public DoctorDto() {
		// TODO Auto-generated constructor stub
	}
	
//	public DoctorDto(Long id, String str, String fullname, String mobilePhone) {
//		super();
//		this.id = id;
//		this.str = str;
//		this.name = fullname;
//		this.mobilePhone = mobilePhone;
//	}
//	
	public DoctorDto(Long id, String str, String name, String mobilePhone, String imagePath) {
		super();
		this.id = id;
		this.str = str;
		this.name = name;
		this.mobilePhone = mobilePhone;
		this.imagePath = imagePath;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
}
