package de.juffel.kvv.model;

// Generated Jun 15, 2014 8:11:47 PM by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * QrycstvvExtendedNodesExtendedNodes generated by hbm2java
 */
@Entity
@Table(name = "qrycstvv_extended_nodes_extended_nodes", catalog = "sakai292")
public class QrycstvvExtendedNodesExtendedNodes implements java.io.Serializable {

	private QrycstvvExtendedNodesExtendedNodesId id;

	public QrycstvvExtendedNodesExtendedNodes() {
	}

	public QrycstvvExtendedNodesExtendedNodes(
			QrycstvvExtendedNodesExtendedNodesId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "parentNodeId", column = @Column(name = "parent_node_id", nullable = false)),
			@AttributeOverride(name = "childNodeId", column = @Column(name = "child_node_id", nullable = false)),
			@AttributeOverride(name = "sortfield", column = @Column(name = "sortfield", nullable = false)) })
	public QrycstvvExtendedNodesExtendedNodesId getId() {
		return this.id;
	}

	public void setId(QrycstvvExtendedNodesExtendedNodesId id) {
		this.id = id;
	}

}