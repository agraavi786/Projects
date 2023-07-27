package com.entity;

import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Shop1 {
	@Id
	public int id; 
	public String delAdd;
	@Column(length=1500)
	public String wishList;
	public String getDelAdd() {
		return delAdd;
	}
	public void setDelAdd(String delAdd) {
		this.delAdd = delAdd;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWishList() {
		return wishList;
	}
	public void setWishList(String wishList) {
		this.wishList = wishList;
	}
	public Shop1(String delAdd, String wishList) {
		super();
		this.delAdd = delAdd;
		this.wishList = wishList;
	}
	
	
	public Shop1(int id, String delAdd, String wishList) {
		super();
		this.id = id;
		this.delAdd = delAdd;
		this.wishList = wishList;
	}
	@Override
	public String toString() {
		return "Shop1 [delAdd=" + delAdd + ", wishList=" + wishList + "]";
	}
	
	

}
