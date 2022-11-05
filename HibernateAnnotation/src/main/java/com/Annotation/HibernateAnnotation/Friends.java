package com.Annotation.HibernateAnnotation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Friends {
	@Id
	@Column(name="FriendName")
  private String Name;
	
  private int batch;
  private String Address;
  @Transient
  private boolean isPlaced;
  
  private String companyName;
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getBatch() {
	return batch;
}
public void setBatch(int batch) {
	this.batch = batch;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public boolean isPlaced() {
	return isPlaced;
}
public void setPlaced(boolean isPlaced) {
	this.isPlaced = isPlaced;
}
public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public Friends(String name, int batch, String address, boolean isPlaced, String companyName) {
	super();
	Name = name;
	this.batch = batch;
	Address = address;
	this.isPlaced = isPlaced;
	this.companyName = companyName;
}
public Friends() {
	super();
}
  
}
