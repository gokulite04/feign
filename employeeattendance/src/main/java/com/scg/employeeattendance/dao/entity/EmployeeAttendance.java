package com.scg.employeeattendance.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "employee_attendance")
public class EmployeeAttendance {
	@Id
	@Column(name = "employeeId")
	int employeeId;
	@Column(name = "employee_attadance")
	int employeeAttadance;

}
