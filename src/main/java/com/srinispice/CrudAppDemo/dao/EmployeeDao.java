package com.srinispice.CrudAppDemo.dao;

import com.srinispice.CrudAppDemo.entity.Employee;

import java.util.List;

public interface EmployeeDao {

    List<Employee> findAll();

    Employee findById(int empId);

    Employee saveEmployee(Employee employee);

    void deleteEmployee(int empId);
}
