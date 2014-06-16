package de.juffel.kvv.model;

// Generated Jun 15, 2014 8:11:47 PM by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * QrtzBlobTriggers generated by hbm2java
 */
@Entity
@Table(name = "qrtz_blob_triggers", catalog = "sakai292")
public class QrtzBlobTriggers implements java.io.Serializable {

	private QrtzBlobTriggersId id;
	private byte[] blobData;

	public QrtzBlobTriggers() {
	}

	public QrtzBlobTriggers(QrtzBlobTriggersId id) {
		this.id = id;
	}

	public QrtzBlobTriggers(QrtzBlobTriggersId id, byte[] blobData) {
		this.id = id;
		this.blobData = blobData;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "triggerName", column = @Column(name = "TRIGGER_NAME", nullable = false, length = 80)),
			@AttributeOverride(name = "triggerGroup", column = @Column(name = "TRIGGER_GROUP", nullable = false, length = 80)) })
	public QrtzBlobTriggersId getId() {
		return this.id;
	}

	public void setId(QrtzBlobTriggersId id) {
		this.id = id;
	}

	@Column(name = "BLOB_DATA")
	public byte[] getBlobData() {
		return this.blobData;
	}

	public void setBlobData(byte[] blobData) {
		this.blobData = blobData;
	}

}