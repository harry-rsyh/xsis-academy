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

import id.bootcamp.dto.LocationData;

@SqlResultSetMappings(
	value = {
		@SqlResultSetMapping(
			name = "locationMapping",
			classes = {
				@ConstructorResult(
					targetClass = LocationData.class,
					columns = {
							@ColumnResult(name = "id", type = Long.class),
							@ColumnResult(name = "name"),
							@ColumnResult(name = "parent_id", type = Long.class),
							@ColumnResult(name = "location_level_id", type = Long.class)
					}
				)
			}
		)
	}
)

@NamedNativeQueries(
	value = {
		@NamedNativeQuery(
			name = "M_Location.getLocationList",
			query = "SELECT id,	name, parent_id, location_level_id FROM m_location;",
			resultSetMapping = "locationMapping",
			resultClass = LocationData.class
		)
	}
)

@Entity
@Table(name = "m_location")
public class M_Location extends BaseProperties{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;
	
	@Column(length = 100)
	private String name;
	
	private Long parentId;
	
	private Long locationLevelId;
	
	public M_Location() {
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
	
}
