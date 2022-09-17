package id.bootcamp.dto;

public class LocationData {
	private Long id;
	private String name;
	private Long parentId;
	private Long locationLevelId;
	
	public LocationData() {
		// TODO Auto-generated constructor stub
	}

	public LocationData(Long id, String name, Long parentId, Long locationLevelId) {
		super();
		this.id = id;
		this.name = name;
		this.parentId = parentId;
		this.locationLevelId = locationLevelId;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Long getParentId() {
		return parentId;
	}

	public Long getLocationLevelId() {
		return locationLevelId;
	}
	
}
