package com.srinispice.CrudAppDemo.service;

import com.srinispice.CrudAppDemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int empId);

    Employee saveEmployee(Employee employee);

    void deleteEmployee(int empId);
}
