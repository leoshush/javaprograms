package com.mavenproject.p1;

import java.sql.Date;

public class StudentDto {
   private int sroll;
   private String firstname;
   private String lname;
   private String dob;
private String gender;
public int getSroll() {
	return sroll;
}
public void setSroll(int sroll) {
	this.sroll = sroll;
}
public StudentDto()
{
	}
public StudentDto(int sroll, String firstname, String lname, String dob, String gender) {
	super();
	this.sroll = sroll;
	this.firstname = firstname;
	this.lname = lname;
	this.dob = dob;
	this.gender = gender;
}
@Override
public String toString() {
	return "StudentDto [sroll=" + sroll + ", firstname=" + firstname + ", lname=" + lname + ", dob=" + dob + ", gender="
			+ gender + "]";
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
}
