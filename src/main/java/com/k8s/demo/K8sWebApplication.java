package com.k8s.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class K8sWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(K8sWebApplication.class, args);
	}

}
