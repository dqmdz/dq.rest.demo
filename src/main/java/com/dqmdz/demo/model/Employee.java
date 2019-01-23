/**
 * 
 */
package com.dqmdz.demo.model;

import java.util.Date;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * @author daniel
 *
 */
@Entity
public class Employee {
	@Id
	@Column(name = "employee_id")
	@NotNull
	private Integer employeeID;
	@Column(name = "name")
	@NotNull
	private String name;
	@Column(name = "role")
	@NotNull
	private String role;
	@Column(name = "id")
	private Long id;
	@Column(name = "created")
	private Date created;
	@Column(name = "updated")
	private Timestamp updated;
	@Column(name = "uuid")
	private String uuid;
	/**
	 * 
	 */
	public Employee() {
	}
	/**
	 * @param employeeID
	 * @param name
	 * @param role
	 * @param created
	 * @param uuid
	 */
	public Employee(@NotNull Integer employeeID, @NotNull String name, @NotNull String role, Long id, Date created,
			Timestamp updated, String uuid) {
		this.employeeID = employeeID;
		this.name = name;
		this.role = role;
		this.id = id;
		this.created = created;
		this.updated = updated;
		this.uuid = uuid;
	}
	/**
	 * @return the employeeID
	 */
	public Integer getEmployeeID() {
		return employeeID;
	}
	/**
	 * @param employeeID the employeeID to set
	 */
	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the created
	 */
	public Date getCreated() {
		return created;
	}
	/**
	 * @param created the created to set
	 */
	public void setCreated(Date created) {
		this.created = created;
	}
	/**
	 * @return the updated
	 */
	public Timestamp getUpdated() {
		return updated;
	}
	/**
	 * @param updated the updated to set
	 */
	public void setUpdated(Timestamp updated) {
		this.updated = updated;
	}
	/**
	 * @return the uuid
	 */
	public String getUuid() {
		return uuid;
	}
	/**
	 * @param uuid the uuid to set
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", name=" + name + ", role=" + role + ", id=" + id + ", created="
				+ created + ", updated=" + updated + ", uuid=" + uuid + "]";
	}
}
