
package com.inovaitsys.multicrud.employee.model;




import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Employee {
	@Id
	@GeneratedValue
	private int id;
	private String fname;
	private String lname;
	private Date dob;
	private String nic;
	
	public int getEid() {
		return id;
	}
	public void setEid(int eid) {
		this.id = eid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getNic() {
		return nic;
	}
	public void setNic(String nic) {
		this.nic = nic;
	}
	public Employee(int eid, String fname, String lname, Date dob, String nic) {
		super();
		this.id = eid;
		this.fname = fname;
		this.lname = lname;
		this.dob = dob;
		this.nic = nic;
	}
	
	public Employee() {
		super();
	}
	
}
