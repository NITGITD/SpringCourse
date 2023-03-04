package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.VotingElgibilityCheckService;

public class SpringBeanLife_DeclarativeTest {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContect.xml");
		VotingElgibilityCheckService service=ctx.getBean("voter",VotingElgibilityCheckService.class);
		
		String result=service.checkVotingElgibility();
		System.out.println(result);
	}

}
