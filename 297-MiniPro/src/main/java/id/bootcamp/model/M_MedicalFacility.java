package id.bootcamp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "m_medical_facility")
public class M_MedicalFacility extends BaseProperties{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;
	
	@Column(length = 50)
	private String name;
	
	private Long medical_facility_category_id;
	
	private Long location_id;
	
	@Column(columnDefinition = "TEXT")
	private String full_address;
	
	@Column(length = 100)
	private String email;
	
	@Column(length = 10)
	private String phone_code;
	
	@Column(length = 15)
	private String phone;
	
	@Column(length = 15)
	private String fax;
	
	public M_MedicalFacility() {
		// TODO Auto-generated constructor stub
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

	public Long getMedical_facility_category_id() {
		return medical_facility_category_id;
	}

	public void setMedical_facility_category_id(Long medical_facility_category_id) {
		this.medical_facility_category_id = medical_facility_category_id;
	}

	public Long getLocation_id() {
		return location_id;
	}

	public void setLocation_id(Long location_id) {
		this.location_id = location_id;
	}

	public String getFull_address() {
		return full_address;
	}

	public void setFull_address(String full_address) {
		this.full_address = full_address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone_code() {
		return phone_code;
	}

	public void setPhone_code(String phone_code) {
		this.phone_code = phone_code;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}
	
}
