package org.utkarsh.parser.jaxb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement
public class Customer {
 
	String name ;
	int age;
	int id;
 
	public String getName() {
		return name;
	}
 
	@XmlAttribute
	public void setName(String name) {
		this.name = name;
	}
 
	public int getAge() {
		return age;
	}
 
	@XmlElement
	public void setAge(int age) {
		this.age = age;
	}
 
	public int getId() {
		return id;
	}
 
	@XmlElement
	public void setId(int id) {
		this.id = id;
	}
 
}