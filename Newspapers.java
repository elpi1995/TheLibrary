package com.cognizant.library;

import org.apache.commons.lang3.StringUtils;

public class Newspapers extends Items{
	private static int numOfPapers = 0;
	private String editor;
	private String publication;
	private String day;
	private String country;
	Newspapers (String headline,String month,int year,String editor,String publication, String day,String country){
		super(headline,month,year);
		this.editor =editor;
		this.publication = publication;
		this.day = day;
		this.country = country;
		numOfPapers++;
		
	}
	String type() {
		return "Newspaper";
	}
	
	//Getters
	public static int getNumOfPapars() {
		return numOfPapers;
	}
	
	public String getPublication() {
		return this.publication;
	}
	public String getEditor() {
		return this.editor;
	}
	public String getDay() {
		return this.day;
	}
	public String getCountry() {
		return this.country;
	}
	
	//Setters
	public void setPublication(String publication) {
		this.publication=publication;
	}
	public void setEditor(String editor) {
		this.editor= editor;
	}
	public void setDay(String day) {
		this.day=day;
	}
	public void setCountry(String country) {
		this.country=country;
	}
}
