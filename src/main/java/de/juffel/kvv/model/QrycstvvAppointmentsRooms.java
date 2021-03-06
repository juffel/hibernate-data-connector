package de.juffel.kvv.model;

// Generated Jun 15, 2014 8:11:47 PM by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * QrycstvvAppointmentsRooms generated by hbm2java
 */
@Entity
@Table(name = "qrycstvv_appointments_rooms", catalog = "sakai292")
public class QrycstvvAppointmentsRooms implements java.io.Serializable {

	private QrycstvvAppointmentsRoomsId id;

	public QrycstvvAppointmentsRooms() {
	}

	public QrycstvvAppointmentsRooms(QrycstvvAppointmentsRoomsId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "appointmentId", column = @Column(name = "appointment_id", nullable = false)),
			@AttributeOverride(name = "roomId", column = @Column(name = "room_id", nullable = false)) })
	public QrycstvvAppointmentsRoomsId getId() {
		return this.id;
	}

	public void setId(QrycstvvAppointmentsRoomsId id) {
		this.id = id;
	}

}
