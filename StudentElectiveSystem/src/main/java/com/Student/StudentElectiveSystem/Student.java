package com.Student.StudentElectiveSystem;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Student {
	@Id
	private int id;
 private String name;
 
 @OneToMany
 private List<Subjects> subject;
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

public List<Subjects> getSubject() {
	return subject;
}
public void setSubject(List<Subjects> subject) {
	this.subject = subject;
}
public Student() {
	super();
	
}
public Student(int id, String name, List<Subjects> subject) {
	super();
	this.id = id;
	this.name = name;
	this.subject = subject;
}

}

