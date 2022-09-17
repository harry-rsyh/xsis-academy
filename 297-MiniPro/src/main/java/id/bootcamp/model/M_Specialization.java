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

import id.bootcamp.dto.SpecializationData;

@SqlResultSetMappings(
	value = {
		@SqlResultSetMapping(
			name = "specializationMapping",
			classes = {
				@ConstructorResult(
					targetClass = SpecializationData.class,
					columns = {
						@ColumnResult(name = "id", type = Long.class),
						@ColumnResult(name = "name"),
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
			query = "SELECT id, name, is_delete FROM m_specialization;",
			resultSetMapping = "specializationMapping",
			resultClass = SpecializationData.class
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
