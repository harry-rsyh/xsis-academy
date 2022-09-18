package id.bootcamp.dto;

public class DtoTest {
	private Long id;
	private Long name;
	
	public DtoTest() {
		// TODO Auto-generated constructor stub
	}

	public DtoTest(Long id, Long name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getName() {
		return name;
	}

	public void setName(Long name) {
		this.name = name;
	}
	
}
