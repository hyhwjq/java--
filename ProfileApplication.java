package com.spring.demo.profile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProfileApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ApplicationContext.class, args);
		String[] activeProfiles = ctx.getEnvironment().getActiveProfiles();
		for (String profile : activeProfiles) {  
	        System.out.println("Spring Boot 使用profile为:{}"+profile);  
	    }  
		SpringApplication.run(ProfileApplication.class, args);
	}
}
