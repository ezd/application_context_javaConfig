package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(AppConfigSimpleBeans.class)
public class AppConfig {
	//SallesServiceImpl(Marketing marketing, PurchaseImpl purchaseImpl)
	//country property value is taken from property and passed to the marketing
	
	@Bean
	SallesService sallesService(Marketing marketing,Purchase purchase) {
		return new SallesServiceImpl(marketing, purchase);
	}
	
	@Bean
	SallesServiceImpl sallesServiceLocal(Marketing marketing,PurchaseImpl purchase) {
		return new SallesServiceImpl(marketing, purchase);
	}
	@Bean
	SallesServiceImpl sallesServiceExport(Marketing marketing,PurchaseImpl2 purchase) {
		return new SallesServiceImpl(marketing, purchase);
	}
	

}
