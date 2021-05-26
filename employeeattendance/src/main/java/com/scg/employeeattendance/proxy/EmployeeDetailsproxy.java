package com.scg.employeeattendance.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "employeenew", url = "http://localhost:8080")
public interface EmployeeDetailsproxy {

	@GetMapping("employees/id/{id}")
	Object getEmployeeById(@RequestParam("id") final int id);

}
