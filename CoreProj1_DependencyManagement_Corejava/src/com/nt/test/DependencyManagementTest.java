package com.nt.test;

import java.time.LocalDateTime;

import com.nt.comps.WishMessageGenerator;

public class DependencyManagementTest {

	public static void main(String[] args) {
		  LocalDateTime sysDate=LocalDateTime.now();
		  WishMessageGenerator generator=new WishMessageGenerator();
		  generator.setLdt(sysDate);
		  String result =generator.generateWidhMessage("Raja");
		  System.out.println("Result::"+result);

	}

}
