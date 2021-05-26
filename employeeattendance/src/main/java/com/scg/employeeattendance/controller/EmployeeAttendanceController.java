package com.scg.employeeattendance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scg.employeeattendance.dao.entity.EmployeeAttendance;
import com.scg.employeeattendance.service.EmployeeAttadenceServiceImpl;

@RequestMapping("/employeesattedence")
@RestController
public class EmployeeAttendanceController {

	@Autowired
	private EmployeeAttadenceServiceImpl employeeAttadenceserviceImpl;

	@PostMapping
	public EmployeeAttendance addEmployeeAttendance(@RequestBody final EmployeeAttendance employeeAttendance) {
		return employeeAttadenceserviceImpl.addEmployeeAttendance(employeeAttendance);
	}

	@GetMapping("/{id}")
	public EmployeeAttendance getEmployeeAttendanceByid(@PathVariable final int id) {
		return employeeAttadenceserviceImpl.getEmployeeAttendanceByid(id);
	}

	@GetMapping("/id/{id}")
	public Object getEmployeeById(@PathVariable final int id) {
		return employeeAttadenceserviceImpl.getEmployeeById(id);
	}

}
