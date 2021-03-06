package de.juffel.kvv.model;

// Generated Jun 15, 2014 8:11:47 PM by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * QrycstvvCoursesExtendedNodes generated by hbm2java
 */
@Entity
@Table(name = "qrycstvv_courses_extended_nodes", catalog = "sakai292")
public class QrycstvvCoursesExtendedNodes implements java.io.Serializable {

	private QrycstvvCoursesExtendedNodesId id;

	public QrycstvvCoursesExtendedNodes() {
	}

	public QrycstvvCoursesExtendedNodes(QrycstvvCoursesExtendedNodesId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "extendedNodeId", column = @Column(name = "extended_node_id", nullable = false)),
			@AttributeOverride(name = "courseId", column = @Column(name = "course_id")),
			@AttributeOverride(name = "submodulAbbr", column = @Column(name = "submodul_abbr", nullable = false, length = 100)),
			@AttributeOverride(name = "positionNumber", column = @Column(name = "position_number")) })
	public QrycstvvCoursesExtendedNodesId getId() {
		return this.id;
	}

	public void setId(QrycstvvCoursesExtendedNodesId id) {
		this.id = id;
	}

}
