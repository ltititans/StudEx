package com.lti.hibstud.stud_proj;

public class Student {
 
	private int id;
	private String name;
	private String cname;
	public Student(int id, String name, String cname) {
		super();
		this.id = id;
		this.name = name;
		this.cname = cname;
	}
	
	
	
	public Student() {
		super();
	}







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
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", cname=" + cname + "]";
	}
	
	
}
