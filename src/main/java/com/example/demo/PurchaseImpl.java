package com.example.demo;

import org.springframework.stereotype.Component;
public class PurchaseImpl implements Purchase {

	@Override
	public double amount(String date) {
		if(date.equalsIgnoreCase("monday"))
		return 0;
		else {
			return 10;
		}
	}

}
