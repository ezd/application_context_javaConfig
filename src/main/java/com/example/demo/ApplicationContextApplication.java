package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ApplicationContextApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationContextApplication.class, args);
		ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
		//we dont need to pass the required bean constructor value it use them from configuration
		SallesService randomSall=(SallesService) context.getBean("sallesServiceLocal");
		SallesService randomSall2=(SallesService) context.getBean("sallesServiceExport");
		
		System.out.println("working"+randomSall.report(1, "monday2"));
		System.out.println("working"+randomSall2.report(12, "monday2"));
	}
	
}
