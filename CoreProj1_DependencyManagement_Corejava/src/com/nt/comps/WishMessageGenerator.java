package com.nt.comps;

import java.time.LocalDateTime;

public class WishMessageGenerator {

	private LocalDateTime ldt;

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator:0-param-constructor");
	}

	public void setLdt(LocalDateTime ldt) {
		System.out.println("WishMessageGenerator.setLdt()");
		this.ldt = ldt;
	}

	public String generateWidhMessage(String user) {
		System.out.println("WishMessageGenerator.generateWidhMessage()");
		int hour = ldt.getHour();
		if (hour < 12)
			return "Good Morning::" + user;
		else if (hour < 16)
			return "Good afternoon::" + user;
		else if (hour < 20)
			return "Good evening::" + user;
		else
			return "Good Night::" + user;
	}

}
