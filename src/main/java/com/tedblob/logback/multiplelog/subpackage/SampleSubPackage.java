package com.tedblob.logback.multiplelog.subpackage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tedblob.logback.multiplelog.MultipleLoggingApplication;

public class SampleSubPackage {


	private static final Logger logger = LoggerFactory.getLogger(SampleSubPackage.class);

	public SampleSubPackage() {
		logger.debug("SampleSubPackage START");
		logger.error("SampleSubPackage error");
		logger.warn("SampleSubPackage warn");
		logger.debug("SampleSubPackage end");
	}

}
