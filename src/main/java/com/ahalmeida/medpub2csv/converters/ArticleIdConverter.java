package com.ahalmeida.medpub2csv.converters;

import com.ahalmeida.medpub2csv.model.ArticleId;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

public class ArticleIdConverter implements Converter {

	public void marshal(Object value, HierarchicalStreamWriter writer, MarshallingContext context) {
		ArticleId articleId = (ArticleId)value;
		writer.addAttribute("IdType", articleId.getIdType());
		writer.setValue(articleId.getValue());
	}

	public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
		ArticleId articleId = new ArticleId();
		articleId.setIdType(reader.getAttribute("IdType"));
		articleId.setValue(reader.getValue());
		return articleId;
	}

	public boolean canConvert(Class clazz) {
		return clazz.equals(ArticleId.class);
	}

}
