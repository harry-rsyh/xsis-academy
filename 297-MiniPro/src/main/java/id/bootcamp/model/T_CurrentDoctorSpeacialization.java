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

import id.bootcamp.dto.DoctorCurrentSpecializationData;

@SqlResultSetMapping(
	name = "doctorCurrentSpecialization",
	classes = {
			@ConstructorResult(
				targetClass = DoctorCurrentSpecializationData.class,
				columns = {
						@ColumnResult(name = "id", type = Long.class),
						@ColumnResult(name = "biodata_id", type = Long.class),
						@ColumnResult(name = "doctor_id", type = Long.class),
						@ColumnResult(name = "doctor_name"),
						@ColumnResult(name = "specialization_id", type = Long.class),
						@ColumnResult(name = "specialization")
				}
			)
	}
)

@NamedNativeQuery(
	name = "T_CurrentDoctorSpeacialization.getAllDoctorsSpecializations",
	query = "SELECT c.id AS id, b.id AS biodata_id, d.id AS doctor_id, b.fullname AS doctor_name, s.id AS specialization_id, s.name AS specialization "
		  + "FROM t_current_doctor_specialization c "
		  + "LEFT JOIN m_doctor d ON c.doctor_id = d.id "
		  + "LEFT JOIN m_biodata b ON d.biodata_id = b.id "
		  + "LEFT JOIN m_specialization s ON c.specialization_id = s.id;",
	resultSetMapping = "doctorCurrentSpecialization",
	resultClass = DoctorCurrentSpecializationData.class
)

@Entity
@Table(name = "t_current_doctor_specialization")
public class T_CurrentDoctorSpeacialization extends BaseProperties{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;

	private Long doctor_id; // Jika disini di deklarasikan InsertTable, sama UpdateTable di set FALSE Smua

	private Long specialization_id;

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

	public Long getSpecialization_id() {
		return specialization_id;
	}

	public void setSpecialization_id(Long specialization_id) {
		this.specialization_id = specialization_id;
	}
}
