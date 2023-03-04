package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Flipkart;

public class StrategyDpTest {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContect.xml");
        Flipkart fpkt1=ctx.getBean("fpkt",Flipkart.class);
        Flipkart fpkt2=ctx.getBean("fpkt",Flipkart.class);
        
        System.out.println("fpkt1==fpkt2?"+(fpkt1==fpkt2));
        System.out.println((fpkt1.hashCode()==fpkt2.hashCode()));
	}

}
