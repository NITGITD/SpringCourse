package com.nt.factory;

import com.nt.comps.BlueDart;
import com.nt.comps.Courier;
import com.nt.comps.DHL;
import com.nt.comps.FirstFlight;
import com.nt.comps.Flipkart;

public class FlipkartFactory {

	public static Flipkart getInstance(String courierType) {
		Courier courier = null;

		if (courierType.equalsIgnoreCase("dhl"))
			courier = new DHL();
		else if (courierType.equalsIgnoreCase("bDart"))
			courier = new BlueDart();
		else if (courierType.equalsIgnoreCase("firstFlight"))
			courier = new FirstFlight();
		else
			throw new IllegalArgumentException("Invalid Courier Type");
		Flipkart fpkt = new Flipkart();
		fpkt.setCourier(courier);
		return fpkt;
	}
}
