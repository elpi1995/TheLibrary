package com.cognizant.library;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Runner {

	public static void main(String[] args) throws IOException {
		ItemsManager iM = new ItemsManager();
		MembersManager mM = new MembersManager();
		LibraryLogManager lm =new LibraryLogManager();
		iM.addItem("Clockwork Orange", "February", 1962, "Anthony Burgess", "Penguin Books", 1, "0-434-09800-0");
		iM.addItem("Artemis Fowl", "April ", 2001, "Eoin Colfer", "Viking Press", 1, "0-670-89962-3");
		iM.addItem("Artemis Fowl: The Arctic Incident", "May  ", 2002, "Eoin Colfer", "Hyperion Books", 1, "978-0-43945070-6");
		iM.addItem("American Journal of Archaeology", "October", 2018, "History", " Archaeological Institute of America", 122, "Thursday", "10.3764/aja.122.4.fm");
		iM.addItem("Boycott Tech giants over terror, MPs urge", "November", 2018, "John Witherow", "The Times", "Friday 23rd", "UK");
		
		mM.addMember("Elpida", "Atmatzidou", "BN2 5UZ", "Mariners Quay", "Brighton", "East Sussex", "UK", "14", "10", "1995", "Permanent");
		
		lm.addLog("I0001", "M0001");
		
		
		
		
	}

}
