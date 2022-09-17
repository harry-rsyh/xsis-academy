package id.bootcamp.dto;

public class SpecializationData {
	
	private Long id;
	private String name;
	private Boolean isDelete;
	
	public SpecializationData() {
		// TODO Auto-generated constructor stub
	}

	public SpecializationData(Long id, String name, Boolean isDelete) {
		this.id = id;
		this.name = name;
		this.isDelete = isDelete;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Boolean getIsDelete() {
		return isDelete;
	}
	
}
