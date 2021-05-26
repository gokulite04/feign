package com.scg.employeeattendance.dao.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scg.employeeattendance.dao.entity.EmployeeAttendance;

public interface EmployeeAttendanceRepository extends JpaRepository<EmployeeAttendance, Integer> {

}
