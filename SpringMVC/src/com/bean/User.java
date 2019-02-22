package com.bean;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class User {
	@NotEmpty(message="UID Field is required!")
	private String uid;
	@NotEmpty(message="Name Field is required!")
	private String uname;
	@NotEmpty(message="Please Enter Password")
	@Length(min=8,message="Password Must be 8 chars")
	private String pwd;
	@Email(message="Enter valid Email")
	private String email;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	

}
