package com.srinispice.CrudAppDemo.dao;

import com.srinispice.CrudAppDemo.entity.Employee;

import java.util.List;

public interface EmployeeDao {

    List<Employee> findAll();
}
