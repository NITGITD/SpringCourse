package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Flipkart;

public class StrategyDpTest {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContect.xml");

		Flipkart fpkt = ctx.getBean("fpkt", Flipkart.class);
		String msg = fpkt.shopping(new String[] { "shirt", "shoe", "dhoti" }, new double[] { 3000.0, 6000.0, 2000.0 });

		System.out.println(msg);
	}

}
