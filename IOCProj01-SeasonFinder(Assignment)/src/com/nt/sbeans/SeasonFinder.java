//SeasonFinder.java
package com.nt.sbeans;

import java.time.LocalDate;

public class SeasonFinder {

	// HAS-A property
	private LocalDate date;

	public SeasonFinder() {
		System.out.println("SeasonFinder :: 0-param constructor");
	}

	// setter method for setter Injection
	public void setDate(LocalDate date) {
		System.out.println("SeasonFinder.setDate()");
		this.date = date;
	}

	// business method
	public String findSeason() {
		System.out.println("SeasonFinder.findSeason()");
		int month = date.getMonthValue();

		if(month >= 3 && month <= 6)
			return "Summer Season";
		else if(month >= 7 && month <= 10)
			return "Monsoon Season";
		else
			return "Winter Season";
	}
}

