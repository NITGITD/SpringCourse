package com.nt.test;

import com.nt.comps.Person;
import com.nt.factory.PersonFactory;

public class FactoryPatternTest {

	public static void main(String[] args) {
	Person per=PersonFactory.getPerson("emp");
	per.doTask();
	System.out.println("_____________________");
	Person per1=PersonFactory.getPerson("stud");
	per1.doTask();

	}

}
