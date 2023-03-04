package com.nt.beans;

import java.time.LocalDateTime;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {

	@Autowired
	private Calendar cal;

	public SeasonFinder() {
		System.out.println("SeasonFinder::0-param constructor");
	}

	public String findSeason(String user) {
		int month = cal.get(Calendar.MONTH);
		if (month >= 2 && month <= 5)
			return "Welcome to Summer Season::" + user;
		else if (month >= 6 && month <= 9)
			return "Welcome to Rainy Season::" + user;
		else
			return "Welcome to Winter Season::"+user;
	}
}
