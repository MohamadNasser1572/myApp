package com.canny.myApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MyAppApplication.class, args);
		Developer dev = context.getBean(Developer.class);
		dev.build();
	}


}
