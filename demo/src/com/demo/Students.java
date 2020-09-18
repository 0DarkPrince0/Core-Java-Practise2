package com.demo;



public class Students {
	private String name;
	private Subjects subject;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Subjects getSubject() {
		return subject;
	}
	public void setSubject(Subjects subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: " + this.name + "\n" + "Subjects: " + subject;
	}
	
}
