package com.hcl.example9;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = {"com.hcl.example9"})
@Configuration
public class AppConfig {
//These Methods are used when we dont want to execute using componant scanner.
//	@Bean("course1")
//	public Course  getCourse1() {
//		
//		return new Course("Java","Satish",1000);
//	}
//	@Bean("course2")
//	public Course  getCourse2() {
//		
//		return new Course("Pyrhon","Satish",2000);
//	}
//	@Bean("course3")
//	public Course  getCourse3() {
//		
//		return new Course("Selenium","Satish",3000);
//	}
	
}
