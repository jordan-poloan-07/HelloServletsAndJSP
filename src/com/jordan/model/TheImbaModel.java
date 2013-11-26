package com.jordan.model;

import java.util.ArrayList;
import java.util.List;

public class TheImbaModel {

	private String stringToDisplay;
	private List<String> stringsToDisplay;

	public TheImbaModel(String toDisplay) {

		this.stringToDisplay = toDisplay;
		this.stringsToDisplay = new ArrayList<>();

		for (byte i = 0; i < 12; i++) {
			stringsToDisplay.add(stringToDisplay);
		}
	}

	public List<String> getStringsToDisplay() {
		return stringsToDisplay;
	}
}
