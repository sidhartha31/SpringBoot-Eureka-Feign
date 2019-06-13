package com.sidharth.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootEurekaClientTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaClientTwoApplication.class, args);
	}

}
