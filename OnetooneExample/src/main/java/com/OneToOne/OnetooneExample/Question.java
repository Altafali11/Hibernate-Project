package com.OneToOne.OnetooneExample;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Question {
	@Id
	@Column(name = "question_id")
 private int id;
 private String question;
 @OneToOne
 private Answers answer;
public Answers getAnswer() {
	return answer;
}
public void setAnswer(Answers answer) {
	this.answer = answer;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public Question() {
	super();
	
}
public Question(int id, String question, Answers answer) {
	super();
	this.id = id;
	this.question = question;
	this.answer = answer;
}
 
 
}
