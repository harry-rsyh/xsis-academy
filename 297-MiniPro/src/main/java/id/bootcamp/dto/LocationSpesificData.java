package id.bootcamp.dto;

public class LocationSpesificData {
	
	private Long id;
	private String name;
	private Long parentId;
	private Long locationLevelId;
	private Boolean isDelete;
	
	public LocationSpesificData() {
		// TODO Auto-generated constructor stub
	}

	public LocationSpesificData(Long id, String name, Long parentId, Long locationLevelId, Boolean isDelete) {
		super();
		this.id = id;
		this.name = name;
		this.parentId = parentId;
		this.locationLevelId = locationLevelId;
		this.isDelete = isDelete;
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

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Long getLocationLevelId() {
		return locationLevelId;
	}

	public void setLocationLevelId(Long locationLevelId) {
		this.locationLevelId = locationLevelId;
	}

	public Boolean getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Boolean isDelete) {
		this.isDelete = isDelete;
	}
	
	private DtoTest dtoTest;

	public DtoTest getDtoTest() {
		return dtoTest;
	}

	public void setDtoTest(DtoTest dtoTest) {
		this.dtoTest = dtoTest;
	}
	
}
