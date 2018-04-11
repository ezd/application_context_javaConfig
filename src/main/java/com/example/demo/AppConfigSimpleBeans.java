package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
		@PropertySource("classpath:application.properties"),
		@PropertySource("classpath:application-${spring.profiles.active}.properties")
}
		)
//the first take us the active one, the second take the value of the active
public class AppConfigSimpleBeans {
	@Value("${salle.countryLocal}")
	String localCountryName;
	@Value("${salle.countryExport}")
	String exportCountryName;
		
	public String getLocalCountryName() {
		return localCountryName;
	}
	public String getExportCountryName() {
		return exportCountryName;
	}
	//SallesServiceImpl(Marketing marketing, PurchaseImpl purchaseImpl)
	//country property value is taken from property and passed to the marketing
	@Bean
	Marketing marketing() {return new Marketing(this.getLocalCountryName(),this.getExportCountryName());}
	@Bean
	PurchaseImpl PurchaseImpl(){return new PurchaseImpl();}
	//this is the default
	@Bean
	Purchase purchase() {return new PurchaseImpl();}
	@Bean
	PurchaseImpl2 purchaseImpl2() { return new PurchaseImpl2();}
	

}
