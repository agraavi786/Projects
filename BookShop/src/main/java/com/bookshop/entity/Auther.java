package com.bookshop.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity

public class Auther {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	String name1;
	String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name1;
	}
	public void setName(String name1) {
		this.name1 = name1;
	}
	public String getAdd() {
		return address;
	}
	public void setAdd(String address) {
		this.address = address;
	}
	public Auther(int id, String name1, String address) {
		super();
		this.id = id;
		this.name1 = name1;
		this.address = address;
	}
	public Auther() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Auther [id=" + id + ", name1=" + name1 + ", address=" + address + "]";
	}
	
	
	

}
