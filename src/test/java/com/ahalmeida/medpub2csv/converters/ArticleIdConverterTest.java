package com.ahalmeida.medpub2csv.converters;

import org.junit.Test;

import com.ahalmeida.medpub2csv.model.ArticleId;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class ArticleIdConverterTest {

	@Test
	public void unmarshallingSetsIdTypeAttributeAtIdType() {
		HierarchicalStreamReader reader = mock(HierarchicalStreamReader.class);
		when(reader.getAttribute("IdType")).thenReturn("foo");

		ArticleId id = (ArticleId)new ArticleIdConverter().unmarshal(reader, null);

		assertEquals("foo", id.getIdType());
	}

	@Test
	public void unmarshallingSetsValueAtTheValueField() {
		HierarchicalStreamReader reader = mock(HierarchicalStreamReader.class);
		when(reader.getValue()).thenReturn("foo");

		ArticleId id = (ArticleId)new ArticleIdConverter().unmarshal(reader, null);

		assertEquals("foo", id.getValue());
	}
}
