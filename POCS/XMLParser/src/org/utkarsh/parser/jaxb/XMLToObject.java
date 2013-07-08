package org.utkarsh.parser.jaxb;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XMLToObject {

	public static void main(String[] args) {
		try {
			File file = new File("jaxb.xml");
			byte[] a = new byte[11];
			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Customer customer = (Customer) jaxbUnmarshaller.unmarshal(file);
			System.out.println(customer.getAge());
			System.out.println(customer.getName());
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
