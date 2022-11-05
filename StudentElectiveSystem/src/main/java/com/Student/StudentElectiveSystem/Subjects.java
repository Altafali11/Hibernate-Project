package com.Student.StudentElectiveSystem;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Subjects {
	@Id
 private int id;
 private String Electivesubject;
 private String duration;
 @ManyToOne
 private Student student;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getElectivesubject() {
	return Electivesubject;
}
public void setElectivesubject(String electivesubject) {
	Electivesubject = electivesubject;
}
public String getDuration() {
	return duration;
}
public void setDuration(String duration) {
	this.duration = duration;
}
public Subjects() {
	super();
}
public Subjects(int id, String electivesubject, String duration) {
	super();
	this.id = id;
	Electivesubject = electivesubject;
	this.duration = duration;
}
public Student getStudent() {
	return student;
}
public void setStudent(Student student) {
	this.student = student;
}
public Subjects(int id, String electivesubject, String duration, Student student) {
	super();
	this.id = id;
	Electivesubject = electivesubject;
	this.duration = duration;
	this.student = student;
}

 
 
 
 
}
