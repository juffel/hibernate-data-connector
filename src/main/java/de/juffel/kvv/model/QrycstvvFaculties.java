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
 * QrycstvvFaculties generated by hbm2java
 */
@Entity
@Table(name = "qrycstvv_faculties", catalog = "sakai292")
public class QrycstvvFaculties implements java.io.Serializable {

	private String id;
	private String abbreviation;
	private String name;
	private String nameEn;
	private String url;
	private Integer instType;
	private Byte discontinued;
	private String sapId;
	private Date createdAt;
	private Date updatedAt;

	public QrycstvvFaculties() {
	}

	public QrycstvvFaculties(String id, String abbreviation) {
		this.id = id;
		this.abbreviation = abbreviation;
	}

	public QrycstvvFaculties(String id, String abbreviation, String name,
			String nameEn, String url, Integer instType, Byte discontinued,
			String sapId, Date createdAt, Date updatedAt) {
		this.id = id;
		this.abbreviation = abbreviation;
		this.name = name;
		this.nameEn = nameEn;
		this.url = url;
		this.instType = instType;
		this.discontinued = discontinued;
		this.sapId = sapId;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false, length = 8)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "abbreviation", nullable = false, length = 100)
	public String getAbbreviation() {
		return this.abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	@Column(name = "name", length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "name_en", length = 50)
	public String getNameEn() {
		return this.nameEn;
	}

	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}

	@Column(name = "url")
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Column(name = "inst_type")
	public Integer getInstType() {
		return this.instType;
	}

	public void setInstType(Integer instType) {
		this.instType = instType;
	}

	@Column(name = "discontinued")
	public Byte getDiscontinued() {
		return this.discontinued;
	}

	public void setDiscontinued(Byte discontinued) {
		this.discontinued = discontinued;
	}

	@Column(name = "sap_id")
	public String getSapId() {
		return this.sapId;
	}

	public void setSapId(String sapId) {
		this.sapId = sapId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", length = 19)
	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_at", length = 19)
	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

}
