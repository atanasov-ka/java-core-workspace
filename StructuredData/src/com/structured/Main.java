package com.structured;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.codehaus.jettison.mapped.MappedNamespaceConvention;
import org.codehaus.jettison.mapped.MappedXMLStreamWriter;

public class Main {

	public static void main(String[] args) {
		try {
			CoreJavaCourse course = new CoreJavaCourse();
			JAXBContext jax = JAXBContext.newInstance(CoreJavaCourse.class,
					Student.class);
			Marshaller marshaller = jax.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,
			
					Boolean.TRUE);
			
			MappedNamespaceConvention mapped = new MappedNamespaceConvention();
			
			Writer w = new OutputStreamWriter(System.out);
			
			MappedXMLStreamWriter strWrit = new MappedXMLStreamWriter(mapped, w);
			
			
			marshaller.marshal(course, strWrit);
			
			/*
			String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\r\n" + 
					"<coreJavaCourse>\r\n" + 
					"    <students>\r\n" + 
					"        <studentId>132</studentId>\r\n" + 
					"        <name>Gundi</name>\r\n" + 
					"    </students>\r\n" + 
					"    <courseId>333</courseId>\r\n" + 
					"    <courseName>Salam</courseName>\r\n" + 
					"</coreJavaCourse>\r\n" + 
					"";
			
			
			Unmarshaller unmarshaller = jax.createUnmarshaller();
			CoreJavaCourse course2 = (CoreJavaCourse) unmarshaller.unmarshal(new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8)));
			System.out.println(course2.toString());			
			*/
			
			
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
