package com.cognizant.library;


import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;

public class LibraryLog {
	private String id;
	private String mID;
	private Date date;
	private boolean checkInOut;
	private static int transactionNo =0;
	private String transactionID;
	private static HashMap<String,LibraryLog> log = new HashMap<String,LibraryLog> ();
	LibraryLog(String id, String mID){
		this.id = id;
		this.checkInOut = true;
		this.date  = Calendar.getInstance().getTime();
		this.transactionID = ""+StringUtils.leftPad(""+transactionNo,10,"0");
		log.put(id,this);
	}
	//Getters
	public String getID() {
		return this.id;
	}
	public String getMID() {
		return this.mID;
	}
	public Date getDate() {
		return this.date;
	}
	public boolean getCheckInOut() {
		return this.checkInOut;
	}
	public int getTransactionNo() {
		return this.transactionNo;
	}
	public String getTransactionID() {
		return this.transactionID;
	}
	public static HashMap<String,LibraryLog> getLog(){
		return log;
	}
	//Setters
	public void setID(String id) {
		this.id=id;
	}
	public void setMID(String mID) {
		this.mID =mID;
	}
	public void setCheckInOut(boolean checkInOut) {
		this.checkInOut=checkInOut;
	}
	public void setTransactionNo(int transactionNo) {
		this.transactionNo = transactionNo;
	}
	public void setTransactionID(String transactionID) {
		this.transactionID=transactionID;
	}
}
