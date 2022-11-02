package com.zaurtregulov.spring.rest.service;

import com.zaurtregulov.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public Employee getEmployee(int employeeId);
    public void saveOrUpdateEmployee(Employee employee);

    public void deleteEmployee(int employeeId);
}
