package com.ahalmeida.medpub2csv.model;

import java.util.List;

public class PubmedData {
	private History history;
	private String publicationStatus;
	private List<ArticleId> articleIdList;

	public History getHistory() {
		return history;
	}

	public void setHistory(History history) {
		this.history = history;
	}

	public String getPublicationStatus() {
		return publicationStatus;
	}

	public void setPublicationStatus(String publicationStatus) {
		this.publicationStatus = publicationStatus;
	}

	public List<ArticleId> getArticleIdList() {
		return articleIdList;
	}

	public void setArticleIdList(List<ArticleId> articleIdList) {
		this.articleIdList = articleIdList;
	}
}
