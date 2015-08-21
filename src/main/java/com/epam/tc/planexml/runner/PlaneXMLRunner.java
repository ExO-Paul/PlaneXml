package com.epam.tc.planexml.runner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.apache.log4j.Logger;
import org.xml.sax.SAXException;

import com.epam.tc.planexml.jaxb.entity.ObjectFactory;
import com.epam.tc.planexml.jaxb.entity.PlaneElement;
import com.epam.tc.planexml.jaxb.entity.RootPlane;

public class PlaneXMLRunner {

	private static final String SCHEMA = "http://www.w3.org/2001/XMLSchema";
	private static final String SCHEMA_LOCATION = "src\\main\\res\\xml\\PlaneXMLSchema.xsd";
	private static final String XSL_LOCATION = "src\\main\\res\\xml\\PlaneStylesheet.xsl";
	private static final String XML_LOCATION = "src\\main\\res\\xml\\PlaneXML.xml";
	private static final String RESULT_LOCATION = "src\\main\\res\\xml\\PlaneXML.out.html";

	private static final String DOC_VALID = "Document is valid";
	private static final String DOC_INVALID = "Document is not valid because";

	private static final Logger LOG = Logger.getLogger(PlaneXMLRunner.class);

	public static void main(String[] args) {
		try {
			
			validate();

			transform();

			RootPlane planes = unmarshall();
			
			for (PlaneElement p : planes.getAircraft()){
				LOG.info(p);
			}
			

		} catch (SAXException ex) {
			LOG.error(ex);
		} catch (JAXBException ex) {
			LOG.error(ex);
		} catch (FileNotFoundException ex) {
			LOG.error(ex);
		} catch (IOException ex) {
			LOG.error(ex);
		}

	}

	private static void validate() throws SAXException, IOException {

		SchemaFactory factory = SchemaFactory.newInstance(SCHEMA);

		File schemaLocation = new File(SCHEMA_LOCATION);

		Schema schema = factory.newSchema(schemaLocation);

		Validator validator = schema.newValidator();
		Source source = new StreamSource(XML_LOCATION);

		try {
			validator.validate(source);
			LOG.info(DOC_VALID);
		} catch (SAXException ex) {
			LOG.error(DOC_INVALID);
			LOG.error(ex.getMessage());
		}
	}

	private static void transform() {
		try {
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer(new StreamSource(XSL_LOCATION));

			transformer.transform(new StreamSource(XML_LOCATION), new StreamResult(RESULT_LOCATION));
			LOG.info("Transformation of " + XML_LOCATION + " is complete");

		} catch (TransformerException ex) {
			LOG.error("Impossible to transform file " + XML_LOCATION + " : " + ex);
		}

	}

	private static RootPlane unmarshall() throws JAXBException, FileNotFoundException {

		JAXBContext jc = JAXBContext.newInstance(ObjectFactory.class);
		Unmarshaller u = jc.createUnmarshaller();
		FileReader reader = new FileReader(XML_LOCATION);
		JAXBElement<RootPlane> planes = (JAXBElement<RootPlane>)u.unmarshal(reader);
		return planes.getValue();

	}
 
}
