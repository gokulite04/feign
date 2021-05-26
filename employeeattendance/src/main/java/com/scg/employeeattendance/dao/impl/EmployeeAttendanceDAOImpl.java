package com.scg.employeeattendance.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.scg.employeeattendance.dao.Repository.EmployeeAttendanceRepository;
import com.scg.employeeattendance.dao.entity.EmployeeAttendance;
import com.scg.employeeattendance.proxy.EmployeeDetailsproxy;

@Component
public class EmployeeAttendanceDAOImpl {

	@Autowired
	private EmployeeAttendanceRepository employAttendanceRepository;
	@Autowired
	private EmployeeDetailsproxy employeeDetailsproxy;

	public EmployeeAttendance addEmployeeAttendance(final EmployeeAttendance employeeAttendance) {
		return employAttendanceRepository.save(employeeAttendance);
	}

	public EmployeeAttendance getEmployeeAttendenceById(final int id) {
		return employAttendanceRepository.findById(id).orElse(null);
	}

	public Object getEmployeeById(final int id) {
		return employeeDetailsproxy.getEmployeeById(id);
	}
}
