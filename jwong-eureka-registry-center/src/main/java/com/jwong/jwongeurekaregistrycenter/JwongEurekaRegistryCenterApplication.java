package com.jwong.jwongeurekaregistrycenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class JwongEurekaRegistryCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwongEurekaRegistryCenterApplication.class, args);
	}
}
