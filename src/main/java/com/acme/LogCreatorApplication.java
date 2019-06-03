package com.acme;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import com.acme.service.LogRunner;

@SpringBootApplication
public class LogCreatorApplication extends SpringBootServletInitializer {

	private static final Logger logger = LogManager.getLogger(LogCreatorApplication.class);

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		logger.info("LogCreatorApplication Servlet Initializer started.");
		LogRunner r1 = new LogRunner("LONDON");
		r1.start();
		return application.sources(LogCreatorApplication.class);
	}

	public static void main(String[] args) {
		logger.info("LogCreatorApplication main started.");
		SpringApplication.run(LogCreatorApplication.class, args);
		LogRunner r1 = new LogRunner("LONDON");
		r1.start();
		logger.info("LogCreatorApplication main completed.");
	}

}
