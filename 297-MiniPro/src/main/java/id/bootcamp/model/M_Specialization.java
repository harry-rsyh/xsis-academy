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

import id.bootcamp.dto.DoctorCurrentSpecializationDto;

@SqlResultSetMappings(
	value = {
		@SqlResultSetMapping(
			name = "specializationMapping",
			classes = {
				@ConstructorResult(
					targetClass = DoctorCurrentSpecializationDto.class,
					columns = {
						@ColumnResult(name = "id", type = Long.class),
						@ColumnResult(name = "doctor_id", type = Long.class),
						@ColumnResult(name = "specialization_id", type = Long.class),
						@ColumnResult(name = "specialization"),
						@ColumnResult(name = "is_delete", type = Boolean.class)
					}
				)
			}
		)
	}
)

@NamedNativeQueries(
	value = {
		@NamedNativeQuery(
			name = "M_Specialization.getSpecializationList",
			query = "SELECT "
					+ "dcs.id, "
					+ "dc.id as doctor_id, "
					+ "dcs.specialization_id, "
					+ "sp.name as specialization, "
					+ "dcs.is_delete "
					+ "FROM m_doctor dc "
					+ "LEFT JOIN m_biodata bd ON dc.biodata_id = bd.id "
					+ "LEFT JOIN t_doctor_current_specialization dcs ON dcs.doctor_id = dc.id "
					+ "LEFT JOIN m_specialization sp ON dcs.specialization_id = sp.id",
			resultSetMapping = "specializationMapping",
			resultClass = DoctorCurrentSpecializationDto.class
		)
	}
)


@Entity
@Table(name = "m_specialization")
public class M_Specialization extends BaseProperties{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;
	
	@Column(length = 50)
	private String name;

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
	
}
