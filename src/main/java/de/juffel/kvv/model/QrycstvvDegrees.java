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
 * QrycstvvDegrees generated by hbm2java
 */
@Entity
@Table(name = "qrycstvv_degrees", catalog = "sakai292")
public class QrycstvvDegrees implements java.io.Serializable {

	private int id;
	private int subjectId;
	private String abbreviation;
	private String name;
	private String nameEn;
	private Byte discontinued;
	private Date createdAt;
	private Date updatedAt;

	public QrycstvvDegrees() {
	}

	public QrycstvvDegrees(int id, int subjectId, String abbreviation,
			String name, String nameEn, Date createdAt, Date updatedAt) {
		this.id = id;
		this.subjectId = subjectId;
		this.abbreviation = abbreviation;
		this.name = name;
		this.nameEn = nameEn;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public QrycstvvDegrees(int id, int subjectId, String abbreviation,
			String name, String nameEn, Byte discontinued, Date createdAt,
			Date updatedAt) {
		this.id = id;
		this.subjectId = subjectId;
		this.abbreviation = abbreviation;
		this.name = name;
		this.nameEn = nameEn;
		this.discontinued = discontinued;
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

	@Column(name = "subject_id", nullable = false)
	public int getSubjectId() {
		return this.subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	@Column(name = "abbreviation", nullable = false, length = 100)
	public String getAbbreviation() {
		return this.abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	@Column(name = "name", nullable = false)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "name_en", nullable = false)
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
