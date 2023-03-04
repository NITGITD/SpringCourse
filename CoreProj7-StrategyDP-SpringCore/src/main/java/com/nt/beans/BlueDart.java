package com.nt.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("bDart")
@Lazy(true)
public final class BlueDart implements Courier {

	public BlueDart() {
		System.out.println("BlueDart::0-param constructor");
	}
	@Override
	public String deliver(int oid) {
		System.out.println("BlueDart.deliver()");
		return oid+"  order id order products are given for delivery to BlueDart Courier Service";
	}

}
