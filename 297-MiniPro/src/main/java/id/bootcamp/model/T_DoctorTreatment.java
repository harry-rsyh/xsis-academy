package id.bootcamp.model;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;
import javax.persistence.Table;

import id.bootcamp.dto.DoctorTreatmentData;

@SqlResultSetMappings(
	value = {
		@SqlResultSetMapping(
			name = "treatmentMapping",
			classes = {
				@ConstructorResult(
					targetClass = DoctorTreatmentData.class,
					columns = {
						@ColumnResult(name = "id", type = Long.class),
						@ColumnResult(name = "name")
					}
				)
			}
		)
	}
)

@NamedNativeQueries(
	value = {
		@NamedNativeQuery(
			name = "T_DoctorTreatment.getTreatmentList",
			query= "SELECT "
				 + "ROW_NUMBER() OVER (ORDER BY name) id, name "
				 + "FROM t_doctor_treatment "
				 + "GROUP by name;",
			resultSetMapping = "treatmentMapping",
			resultClass = DoctorTreatmentData.class
		)
	}
)

@Entity
@Table(name = "t_doctor_treatment")
public class T_DoctorTreatment extends BaseProperties{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;
	
	private Long doctor_id;
	
	@Column(length = 50)
	private String name;
	
	public T_DoctorTreatment() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getDoctor_id() {
		return doctor_id;
	}

	public void setDoctor_id(Long doctor_id) {
		this.doctor_id = doctor_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
