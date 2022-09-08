package id.bootcamp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonFormat;

@MappedSuperclass
public class BaseProperties {
	@Column(nullable = false)
	private Long created_by;
	
	@Column(nullable = false)
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm", timezone = "Asia/Jakarta")
	private Date created_on;
	
	private Long modified_by;
	
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm", timezone = "Asia/Jakarta")
	private Date modified_on;
	
	private Long deleted_by;
	
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm", timezone = "Asia/Jakarta")
	private Date deleted_on;
	
	@Column(nullable = false, columnDefinition = "boolean default false")
	private Boolean is_delete = false;

	public Long getCreated_by() {
		return created_by;
	}

	public void setCreated_by(Long created_by) {
		this.created_by = created_by;
	}

	public Date getCreated_on() {
		return created_on;
	}

	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}

	public Long getModified_by() {
		return modified_by;
	}

	public void setModified_by(Long modified_by) {
		this.modified_by = modified_by;
	}

	public Date getModified_on() {
		return modified_on;
	}

	public void setModified_on(Date modified_on) {
		this.modified_on = modified_on;
	}

	public Long getDeleted_by() {
		return deleted_by;
	}

	public void setDeleted_by(Long deleted_by) {
		this.deleted_by = deleted_by;
	}

	public Date getDeleted_on() {
		return deleted_on;
	}

	public void setDeleted_on(Date deleted_on) {
		this.deleted_on = deleted_on;
	}

	public Boolean getIs_delete() {
		return is_delete;
	}

	public void setIs_delete(Boolean is_delete) {
		this.is_delete = is_delete;
	}
	
}
