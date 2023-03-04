package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("fpkt")
@Scope("singleton")
public final class Flipkart {

	public Flipkart() {
		System.out.println("Flipkart::0-param constructor");
	}

}
