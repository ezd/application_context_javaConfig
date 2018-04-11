package com.example.demo;

public class SallesServiceImpl implements SallesService {
    Marketing marketing;
    Purchase purchase;
    
    
	
	public SallesServiceImpl(Marketing marketing, Purchase purchase) {
		this.marketing = marketing;
		this.purchase = purchase;
	}



	@Override
	public String report(int marketingId,String date) {
		// TODO Auto-generated method stub
		return "the report in imp1 is: \n marketing:"+this.marketing.getAds(marketingId)+"\n"
				+ "purchase:"+this.purchase.amount(date);
	}

}
