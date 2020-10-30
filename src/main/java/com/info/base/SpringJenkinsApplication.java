package com.info.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {

	static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);

	public void init() {
		logger.info("Application Started...");
		logger.info("Application Started 123...",Constant.DATA_TYPE);
	}

	public static void main(String[] args) {
		logger.info("Application Executed...");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
