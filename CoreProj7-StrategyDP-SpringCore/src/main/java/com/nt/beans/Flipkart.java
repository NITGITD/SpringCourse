package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")
public final class Flipkart {

	@Autowired
	@Qualifier("fFlight")
	private Courier courier;

	public Flipkart() {
		System.out.println("Flipkart::0-param constructor");
	}

	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier()");
		this.courier = courier;
	}

	public String shopping(String items[], double prices[]) {
		System.out.println("Flipkart.shopping()");
		double billAmt = 0.0;
		for (double price : prices) {
			billAmt = billAmt + price;
		}
		int oid = new Random().nextInt(100000);
		String deliveryMsg = courier.deliver(oid);
		return Arrays.toString(items) + "  are purchased having bill amt::" + billAmt + ".........." + deliveryMsg;

	}

}
