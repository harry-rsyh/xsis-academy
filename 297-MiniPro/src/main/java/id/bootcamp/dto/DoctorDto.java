package id.bootcamp.dto;

public class DoctorDto {
	private Long id;
	private String str;
	private String name;
	private String mobilePhone;
	private String imagePath;
	private Boolean isDelete;

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
	
}
