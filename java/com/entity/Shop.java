package com.entity;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="shop")
public class Shop {
	
	public String name;
	@Id
	public int id;
	public String email;
	public int pass;
	public int repass;
	public Date date;
	public int mbnumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return mbnumber;
	}
	public void setNumber(int mbnumber) {
		this.mbnumber = mbnumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPass() {
		return pass;
	}
	public void setPass(int pass) {
		this.pass = pass;
	}
	public int getRepass() {
		return repass;
	}
	public void setRepass(int repass) {
		this.repass = repass;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Shop(String name, String email, int mbnumber,int pass, int repass, Date date) {
		super();
		this.name = name;
		this.email = email;
		this.pass = pass;
		this.repass = repass;
		this.date = date;
	}
	public Shop(String name, int id, String email, int mbnumber,int pass, int repass, Date date) {
		super();
		this.name = name;
		this.id = id;
		this.mbnumber=mbnumber;
		this.email = email;
		this.pass = pass;
		this.repass = repass;
		this.date = date;
	}
	public Shop() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Shop [name=" + name + ", id=" + id + ", email=" + email + ", pass=" + pass + ", repass=" + repass
				+ ", date=" + date + "]";
	}
	

}
