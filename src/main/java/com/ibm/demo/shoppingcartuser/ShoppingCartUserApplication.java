package com.ibm.demo.shoppingcartuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;



@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class ShoppingCartUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingCartUserApplication.class, args);
	}

}
