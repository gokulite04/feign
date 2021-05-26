package com.scg.employeeattendance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class EmployeeattendanceApplication {

	public static void main(final String[] args) {
		SpringApplication.run(EmployeeattendanceApplication.class, args);
	}

}
