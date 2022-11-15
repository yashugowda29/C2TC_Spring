package com.cg.cm;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class College {
	
	private int id;
	private String collegeadmin;
	private String collegename;
	private String location;
	
	public College() {
		super();
	}

	public College(int id, String collegeadmin, String collegename, String location) {
		super();
		this.id = id;
		this.collegeadmin = collegeadmin;
		this.collegename = collegename;
		this.location = location;
	}

	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCollegeadmin() {
		return collegeadmin;
	}

	public void setCollegeadmin(String collegeadmin) {
		this.collegeadmin = collegeadmin;
	}

	public String getCollegename() {
		return collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "College [id=" + id + ", collegeadmin=" + collegeadmin + ", collegename=" + collegename + ", location="
				+ location + ", getId()=" + getId() + ", getCollegeadmin()=" + getCollegeadmin() + ", getCollegename()="
				+ getCollegename() + ", getLocation()=" + getLocation() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}	
}