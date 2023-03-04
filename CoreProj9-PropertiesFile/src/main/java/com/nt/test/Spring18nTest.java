package com.nt.test;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring18nTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContect.xml");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter language code");
		String langcode = sc.next();

		System.out.println("Enter Country code");
		String countryCode = sc.next();

		Locale locale = new Locale(langcode, countryCode);
		String msg = ctx.getMessage("wish.message", new Object[] {}, locale);
		System.out.println("Wish Message is ::" + msg);
		ctx.close();
	}

}
