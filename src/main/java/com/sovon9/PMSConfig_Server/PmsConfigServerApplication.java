package com.sovon9.PMSConfig_Server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class PmsConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PmsConfigServerApplication.class, args);
	}

}
