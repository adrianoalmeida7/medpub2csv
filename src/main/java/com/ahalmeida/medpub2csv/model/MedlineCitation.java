package com.ahalmeida.medpub2csv.model;

import java.util.List;

public class MedlineCitation {

	private String owner;
	private String status;
	private String pmid;
	private Date dateCreated;
	private Date dateCompleted;

	private String citationSubSet;
	private MedLineJournalInfo medLineJournalInfo;
	private List<MeshHeading> meshHeading;

	public List<MeshHeading> getMeshHeading() {
		return meshHeading;
	}

	public void setMeshHeading(List<MeshHeading> meshHeading) {
		this.meshHeading = meshHeading;
	}
}
