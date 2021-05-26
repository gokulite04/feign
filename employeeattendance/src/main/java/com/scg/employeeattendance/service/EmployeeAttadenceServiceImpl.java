package com.scg.employeeattendance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scg.employeeattendance.dao.entity.EmployeeAttendance;
import com.scg.employeeattendance.dao.impl.EmployeeAttendanceDAOImpl;

@Service
public class EmployeeAttadenceServiceImpl implements EmployeeAttendanceService {

	@Autowired
	private EmployeeAttendanceDAOImpl employeeAttendanceDAOImpl;

	@Override
	public EmployeeAttendance addEmployeeAttendance(final EmployeeAttendance employeeAttendance) {

		return employeeAttendanceDAOImpl.addEmployeeAttendance(employeeAttendance);
	}

	@Override
	public EmployeeAttendance getEmployeeAttendanceByid(final int id) {
		return employeeAttendanceDAOImpl.getEmployeeAttendenceById(id);
	}

	@Override
	public Object getEmployeeById(final int id) {
		return employeeAttendanceDAOImpl.getEmployeeById(id);

	}

}
