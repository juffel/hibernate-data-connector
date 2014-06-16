package de.juffel.kvv.model;

// Generated Jun 15, 2014 8:11:47 PM by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * QrycstvvExtendedNodesExtendedNodesId generated by hbm2java
 */
@Embeddable
public class QrycstvvExtendedNodesExtendedNodesId implements
		java.io.Serializable {

	private int parentNodeId;
	private int childNodeId;
	private int sortfield;

	public QrycstvvExtendedNodesExtendedNodesId() {
	}

	public QrycstvvExtendedNodesExtendedNodesId(int parentNodeId,
			int childNodeId, int sortfield) {
		this.parentNodeId = parentNodeId;
		this.childNodeId = childNodeId;
		this.sortfield = sortfield;
	}

	@Column(name = "parent_node_id", nullable = false)
	public int getParentNodeId() {
		return this.parentNodeId;
	}

	public void setParentNodeId(int parentNodeId) {
		this.parentNodeId = parentNodeId;
	}

	@Column(name = "child_node_id", nullable = false)
	public int getChildNodeId() {
		return this.childNodeId;
	}

	public void setChildNodeId(int childNodeId) {
		this.childNodeId = childNodeId;
	}

	@Column(name = "sortfield", nullable = false)
	public int getSortfield() {
		return this.sortfield;
	}

	public void setSortfield(int sortfield) {
		this.sortfield = sortfield;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof QrycstvvExtendedNodesExtendedNodesId))
			return false;
		QrycstvvExtendedNodesExtendedNodesId castOther = (QrycstvvExtendedNodesExtendedNodesId) other;

		return (this.getParentNodeId() == castOther.getParentNodeId())
				&& (this.getChildNodeId() == castOther.getChildNodeId())
				&& (this.getSortfield() == castOther.getSortfield());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getParentNodeId();
		result = 37 * result + this.getChildNodeId();
		result = 37 * result + this.getSortfield();
		return result;
	}

}
