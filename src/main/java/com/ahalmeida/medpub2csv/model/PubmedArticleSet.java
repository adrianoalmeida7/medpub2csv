package com.ahalmeida.medpub2csv.model;

import java.util.List;

public class PubmedArticleSet {
	private List<PubmedArticle> pubmedArticles;

	public List<PubmedArticle> getPubmedArticles() {
		return pubmedArticles;
	}

	public void setPubmedArticles(List<PubmedArticle> pubmedArticles) {
		this.pubmedArticles = pubmedArticles;
	}
}
