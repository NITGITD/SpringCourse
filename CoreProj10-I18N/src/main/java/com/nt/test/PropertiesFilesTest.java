package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.PersonInfo;

public class PropertiesFilesTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContect.xml");
		PersonInfo info=ctx.getBean("per",PersonInfo.class);
		System.out.println(info);
		ctx.close();
	}

}
