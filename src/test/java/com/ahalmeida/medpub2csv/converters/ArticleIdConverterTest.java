package com.ahalmeida.medpub2csv.converters;

import org.junit.Test;

import com.ahalmeida.medpub2csv.model.ArticleId;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
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

	@Test
	public void articleIdIsConversible() {
		boolean isConversible = new ArticleIdConverter().canConvert(ArticleId.class);
		assertTrue(isConversible);
	}

	@Test
	public void marshallingArticleIdSetsTheIdTypeAttribute() {
		ArticleId id = new ArticleId();
		id.setIdType("foo");

		HierarchicalStreamWriter writer = mock(HierarchicalStreamWriter.class);
		new ArticleIdConverter().marshal(id, writer, null);

		verify(writer).addAttribute("IdType", "foo");
	}

	@Test
	public void marshallingArticleIdSetsTheValue() {
		ArticleId id = new ArticleId();
		id.setValue("foo");

		HierarchicalStreamWriter writer = mock(HierarchicalStreamWriter.class);
		new ArticleIdConverter().marshal(id, writer, null);

		verify(writer).setValue("foo");
	}
}
