package com.tedblob.logback.multiplelog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tedblob.logback.multiplelog.subpackage.SampleSubPackage;

@SpringBootApplication
public class MultipleLoggingApplication {

	private static final Logger logger = LoggerFactory.getLogger(MultipleLoggingApplication.class);

	public static void main(String[] args) {
		logger.debug("SpringBootApplication main START");
		SpringApplication.run(MultipleLoggingApplication.class, args);
		logger.error("SpringBootApplication error in main method");
		
		logger.warn("SpringBootApplication warning in main method");
		logger.debug("SpringBootApplication main method END");
		SampleSubPackage sub = new SampleSubPackage();
	}

}
