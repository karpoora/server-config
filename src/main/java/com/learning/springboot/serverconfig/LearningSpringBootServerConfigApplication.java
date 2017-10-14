package com.learning.springboot.serverconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class LearningSpringBootServerConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningSpringBootServerConfigApplication.class, args);
	}
}
