package com.jwong.jwongeurekaproviderjpush;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class JwongEurekaProviderJpushApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwongEurekaProviderJpushApplication.class, args);
	}
}
