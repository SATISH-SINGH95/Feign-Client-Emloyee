package com.employeeClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EmployeeClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeClientApplication.class, args);
	}

}
