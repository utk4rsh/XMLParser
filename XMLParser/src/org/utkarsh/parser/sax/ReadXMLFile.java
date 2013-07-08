package org.utkarsh.parser.sax;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ReadXMLFile {

	public static void main(String argv[]) {

	    SAXParserFactory factory = SAXParserFactory.newInstance();
	    SAXParser saxParser;

	    try
	    {
	      saxParser = factory.newSAXParser();

	      DefaultHandler handler = new DefaultHandler()
	      {
	        
	      };
	    }
	    catch (ParserConfigurationException e)
	    {
	    }
	    catch (SAXException e)
	    {
	    }
	  }


}
