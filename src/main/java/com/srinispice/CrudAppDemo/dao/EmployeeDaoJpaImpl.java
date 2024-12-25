package com.srinispice.CrudAppDemo.dao;

import com.srinispice.CrudAppDemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDaoJpaImpl implements EmployeeDao{

    private final EntityManager entityManager;

    @Autowired
    public EmployeeDaoJpaImpl(EntityManager theEnitytyManager) {
        entityManager = theEnitytyManager;
    }

    @Override
    public List<Employee> findAll() {

        TypedQuery<Employee> empQuery = entityManager.createQuery("from Employee", Employee.class);
        return empQuery.getResultList();
    }

    @Override
    public Employee findById(int empId) {
        return entityManager.find(Employee.class,empId);
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        System.out.println("---employee--- "+employee);
        return entityManager.merge(employee);
    }

    @Override
    public void deleteEmployee(int empId) {
        Employee theEmployee = entityManager.find(Employee.class,empId);
        entityManager.remove(theEmployee);
    }
}
