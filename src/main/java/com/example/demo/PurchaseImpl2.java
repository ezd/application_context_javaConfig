package com.example.demo;

import org.springframework.stereotype.Component;
public class PurchaseImpl2 implements Purchase {

	@Override
	public double amount(String date) {
		if(date.equalsIgnoreCase("monday"))
		return 5;
		else {
			return 15;
		}
	}

}
