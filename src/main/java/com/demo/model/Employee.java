package com.demo.model;

import java.util.Date;
import java.util.List;

public class Employee {
	
	public String firstname;
	public String lastname;
	public  Long  ssnid;
	public Date birthdate;
	public List<String> hobbies;
	
	public Long getSsnid() {
		return ssnid;
	}
	public void setSsnid(Long ssnid) {
		this.ssnid = ssnid;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}
