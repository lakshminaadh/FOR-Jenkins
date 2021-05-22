package com.ramisetti.jenkins;



import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class JenkinsJobCreateApplication {

	public static Logger logger = LoggerFactory.getLogger(JenkinsJobCreateApplication.class);
	
	
	@PostConstruct
	public void Mesg(String name) {
		logger.info("ramisetti jenkins applications started");

	}
	public static void main(String[] args) {
		

		logger.info("ramisetti jenkins main method executes with no errors");
		SpringApplication.run(JenkinsJobCreateApplication.class, args);
	}

}
