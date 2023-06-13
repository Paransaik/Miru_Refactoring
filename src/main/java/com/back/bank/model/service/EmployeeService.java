package com.back.bank.model.service;

import com.back.bank.model.dto.Employee;

import java.util.Map;

public interface EmployeeService {
	void registerEmployee(Employee.Entity employee) throws Exception;

	void updateEmployee(Map<String, String> map) throws Exception;

	void deleteEmployee(String id) throws Exception;

	Employee.Entity getEmployee(String id) throws Exception;

	Employee.Entity loginEmployee(String id, String password) throws Exception;

	int checkPasswordFind(String id, String email) throws Exception;

	void updatePassword(String id) throws Exception;

}
