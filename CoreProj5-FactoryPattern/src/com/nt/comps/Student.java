package com.nt.comps;

import java.util.Random;

public class Student implements Person {

	public Student() {
		System.out.println("Student:0-param constructor");
	}
	@Override
	public void doTask() {
	  System.out.println("Student is studing the engineering");
	}

}
