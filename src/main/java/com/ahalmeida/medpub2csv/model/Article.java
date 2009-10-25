package com.ahalmeida.medpub2csv.model;

public class Article {
	private String language;
	private ArticleDate articleDate;

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public ArticleDate getArticleDate() {
		return articleDate;
	}

	public void setArticleDate(ArticleDate articleDate) {
		this.articleDate = articleDate;
	}
}
