package com.learning.springboot.serverconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

// @Enable-config-service - centralized configuration - git

@SpringBootApplication
@EnableConfigServer
public class LearningSpringBootServerConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningSpringBootServerConfigApplication.class, args);
	}
}
