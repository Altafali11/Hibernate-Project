package com.Fetch_data.get_load;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Student {
	@Id
  private int id;
	@Column(name = "Student_name")
  private String name;
  private String City;
  @Transient
  private boolean isplaced;
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
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public boolean isIsplaced() {
	return isplaced;
}
public void setIsplaced(boolean isplaced) {
	this.isplaced = isplaced;
}
public Student() {
	super();
}
public Student(int id, String name, String city, boolean isplaced) {
	super();
	this.id = id;
	this.name = name;
	City = city;
	this.isplaced = isplaced;
}
  
}
