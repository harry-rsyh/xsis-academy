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

import id.bootcamp.dto.DtoTest;
import id.bootcamp.dto.LocationParentData;
import id.bootcamp.dto.LocationSpesificData;

@SqlResultSetMappings(
	value = {
		@SqlResultSetMapping(
			name = "locationMapping",
			classes = {
				@ConstructorResult(
					targetClass = LocationSpesificData.class,
					columns = {
							@ColumnResult(name = "id", type = Long.class),
							@ColumnResult(name = "name"),
							@ColumnResult(name = "parent_id", type = Long.class),
							@ColumnResult(name = "location_level_id", type = Long.class),
							@ColumnResult(name = "is_delete", type = Boolean.class)
					}
				)
			}
		),
		@SqlResultSetMapping(
			name = "kecamatanMapping",
			classes = {
				@ConstructorResult(
					targetClass = LocationSpesificData.class,
					columns = {
							@ColumnResult(name = "id", type = Long.class),
							@ColumnResult(name = "name"),
							@ColumnResult(name = "parent_id", type = Long.class),
							@ColumnResult(name = "location_level_id", type = Long.class),
							@ColumnResult(name = "is_delete", type = Boolean.class)
					}
				)
			}
		),
		@SqlResultSetMapping(
			name = "kabKotaMapping",
			classes = {
				@ConstructorResult(
					targetClass = LocationSpesificData.class,
					columns = {
							@ColumnResult(name = "id", type = Long.class),
							@ColumnResult(name = "name"),
							@ColumnResult(name = "parent_id", type = Long.class),
							@ColumnResult(name = "location_level_id", type = Long.class),
							@ColumnResult(name = "is_delete", type = Boolean.class)
					}
				)
			}
		),
		@SqlResultSetMapping(
			name = "testMapping",
			classes = {
				@ConstructorResult(
					targetClass = LocationSpesificData.class,
					columns = {
							@ColumnResult(name = "id", type = Long.class),
							@ColumnResult(name = "name"),
							@ColumnResult(name = "parent_id", type = Long.class),
							@ColumnResult(name = "location_level_id", type = Long.class),
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
			name = "M_Location.getLocationList",
			query = "SELECT id,	name, parent_id, location_level_id, is_delete FROM m_location;",
			resultSetMapping = "locationMapping",
			resultClass = LocationSpesificData.class
		),
		@NamedNativeQuery(
			name = "M_Location.getKecamatanList",
			query = "SELECT	id,	name, parent_id, location_level_id,	is_delete "
				  + "FROM m_location WHERE location_level_id = 4;",
			resultSetMapping = "kecamatanMapping",
			resultClass = LocationSpesificData.class
		),
		@NamedNativeQuery(
			name = "M_Location.getKabKotaList",
			query = "SELECT	id,	name, parent_id, location_level_id,	is_delete "
				  + "FROM m_location WHERE location_level_id = 2 OR location_level_id = 3;",
			resultSetMapping = "kabKotaMapping",
			resultClass = LocationSpesificData.class
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
