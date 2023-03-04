package com.nt.test;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.cfgs.AppConfig;
import com.nt.sbeans.WishMessageGenerator;

public class JavaConfigAppTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		
		 WishMessageGenerator generator=ctx.getBean("wmg",WishMessageGenerator.class);
		 String result =generator.generateWidhMessage("Raja");
				 System.out.println(result);
		 
		ctx.close();
	}

}
