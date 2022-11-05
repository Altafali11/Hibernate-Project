package com.OneToOne.OnetooneExample;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answers {
	@Id
	@Column(name = "answer_id")
 private int id;
 private String answer;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getAnswer() {
	return answer;
}
public void setAnswer(String answer) {
	this.answer = answer;
}
public Answers(int id, String answer) {
	super();
	this.id = id;
	this.answer = answer;
}
public Answers() {
	super();
}
 
}
