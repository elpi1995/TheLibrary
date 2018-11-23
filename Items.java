package com.cognizant.library;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;

public abstract class Items {
	abstract String type();
	private static int numOfItems = 1;
	private String title;
	private String month;
	private int year;
	private String id;
	private static HashMap<String,Items> items = new HashMap<String,Items>();
	Items(String title,String month,int year){
		this.title = title;
		this.month = month;
		this.year = year;
		this.id= "I"+StringUtils.leftPad(""+numOfItems,4,"0");
		numOfItems++;
		items.put(id, this);
		
	}
	//Getters
	public String getTitle() {
		return this.title;
	}
	public int getYear() {
		return this.year;
	}
	public String getMonth() {
		return this.month;
	}
	public static HashMap<String,Items> getItems(){
		return items;
	}
	//Setters
	public void setTitle(String title) {
		this.title=title;
	}
	public void setYear(int year) {
		this.year=year;
	}
	public void setMonth(String month) {
		this.month =month;
	}
	public void setItems(HashMap<String,Items> item){
		items = item;
	}
	
	
	
}
