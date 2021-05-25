package com.spring.jenkins;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {
	
	 public static Logger logger= LoggerFactory.getLogger(SpringJenkinsApplication.class);
	
	@PostConstruct
	public void init()
	{
		System.out.println("programm started");
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
