package com.scg.employeeattendance.service;

import com.scg.employeeattendance.dao.entity.EmployeeAttendance;

public interface EmployeeAttendanceService {
	EmployeeAttendance addEmployeeAttendance(final EmployeeAttendance employeeAttendance);

	EmployeeAttendance getEmployeeAttendanceByid(final int id);

	Object getEmployeeById(final int id);

}
