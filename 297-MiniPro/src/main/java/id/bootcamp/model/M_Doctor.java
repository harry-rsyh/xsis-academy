package id.bootcamp.model;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

import id.bootcamp.dto.DoctorData;

@SqlResultSetMapping(
		name = "doctorMapping",
		classes = {
				@ConstructorResult(
					targetClass = DoctorData.class,
					columns = {
							@ColumnResult(name = "id" , type = Long.class),
							@ColumnResult(name = "name"),
							@ColumnResult(name = "str"),
							@ColumnResult(name = "mobile_phone"),
							@ColumnResult(name = "image_path")
					}
				)
		}
)

@NamedNativeQuery(
		name = "M_Doctor.getAllDoctors",
		query = "SELECT d.id, b.fullname as name, d.str, b.mobile_phone, b.image_path FROM m_doctor d\r\n"
				+ "LEFT JOIN m_biodata b "
				+ "ON b.id = d.biodata_id "
				+ "WHERE d.is_delete = false;",
		resultSetMapping = "doctorMapping",
		resultClass = DoctorData.class
)

@Entity
@Table(name = "m_doctor")
public class M_Doctor extends BaseProperties{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;
	
	private Long biodata_id;

	@Column(length = 50)
	private String str;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBiodata_id() {
		return biodata_id;
	}

	public void setBiodata_id(Long biodata_id) {
		this.biodata_id = biodata_id;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
}
