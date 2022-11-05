package com.hibernate.Hibernate_basics;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
@Id	
private int id;

private String name;

private int sallery;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSallery() {
	return sallery;
}
public void setSallery(int sallery) {
	this.sallery = sallery;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", sallery=" + sallery + "]";
}


}