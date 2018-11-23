package com.cognizant.library;

public class LibraryLogManager {
	//CheckIn
	public String addLog(String id, String mID ) {
		LibraryLog log =new LibraryLog(id,mID);
		return "New log";
	}
	public String statusUpdateByID(String id,boolean checkInOut) {
		LibraryLog.getLog().get(id).setCheckInOut(checkInOut);
		if(checkInOut == true){
			return "The item: " +id+" has been checked out!";
		}
		else {
			return "The item: " +id+" has been checked in!";
		}
	}
	
}
