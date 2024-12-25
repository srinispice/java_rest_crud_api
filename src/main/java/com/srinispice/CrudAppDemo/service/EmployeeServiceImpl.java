package com.srinispice.CrudAppDemo.service;

import com.srinispice.CrudAppDemo.dao.EmployeeDao;
import com.srinispice.CrudAppDemo.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeDao employeeDao;

    @Autowired
    public EmployeeServiceImpl(EmployeeDao theEmployeeDao) {
        this.employeeDao = theEmployeeDao;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }

    @Override
    public Employee findById(int empId) {
        return employeeDao.findById(empId);
    }

    @Transactional
    @Override
    public Employee saveEmployee(Employee employee) {
        employee.setId(0);
        return employeeDao.saveEmployee(employee);
    }

    @Transactional
    @Override
    public void deleteEmployee(int empId) {
        employeeDao.deleteEmployee(empId);
    }
}
