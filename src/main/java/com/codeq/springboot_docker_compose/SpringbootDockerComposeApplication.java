package com.codeq.springboot_docker_compose;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDockerComposeApplication {

	// Make logger static to access it in the static main method
	private static final Logger logger = LoggerFactory.getLogger(SpringbootDockerComposeApplication.class);

	public void init(){
		logger.info("Application initialized");
	}

	public static void main(String[] args) {
		logger.info("Application started");
		SpringApplication.run(SpringbootDockerComposeApplication.class, args);
	}
}
