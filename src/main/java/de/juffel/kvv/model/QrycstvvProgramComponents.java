package de.juffel.kvv.model;

// Generated Jun 15, 2014 8:11:47 PM by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * QrycstvvProgramComponents generated by hbm2java
 */
@Entity
@Table(name = "qrycstvv_program_components", catalog = "sakai292")
public class QrycstvvProgramComponents implements java.io.Serializable {

	private int id;
	private int degreeId;
	private String abbreviation;
	private String name;
	private String nameEn;
	private Byte discontinued;
	private int sortfield;
	private Date createdAt;
	private Date updatedAt;

	public QrycstvvProgramComponents() {
	}

	public QrycstvvProgramComponents(int id, int degreeId, String abbreviation,
			String name, int sortfield, Date createdAt, Date updatedAt) {
		this.id = id;
		this.degreeId = degreeId;
		this.abbreviation = abbreviation;
		this.name = name;
		this.sortfield = sortfield;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public QrycstvvProgramComponents(int id, int degreeId, String abbreviation,
			String name, String nameEn, Byte discontinued, int sortfield,
			Date createdAt, Date updatedAt) {
		this.id = id;
		this.degreeId = degreeId;
		this.abbreviation = abbreviation;
		this.name = name;
		this.nameEn = nameEn;
		this.discontinued = discontinued;
		this.sortfield = sortfield;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "degree_id", nullable = false)
	public int getDegreeId() {
		return this.degreeId;
	}

	public void setDegreeId(int degreeId) {
		this.degreeId = degreeId;
	}

	@Column(name = "abbreviation", nullable = false, length = 100)
	public String getAbbreviation() {
		return this.abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	@Column(name = "name", nullable = false, length = 65535)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "name_en", length = 65535)
	public String getNameEn() {
		return this.nameEn;
	}

	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}

	@Column(name = "discontinued")
	public Byte getDiscontinued() {
		return this.discontinued;
	}

	public void setDiscontinued(Byte discontinued) {
		this.discontinued = discontinued;
	}

	@Column(name = "sortfield", nullable = false)
	public int getSortfield() {
		return this.sortfield;
	}

	public void setSortfield(int sortfield) {
		this.sortfield = sortfield;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", nullable = false, length = 19)
	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_at", nullable = false, length = 19)
	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

}
