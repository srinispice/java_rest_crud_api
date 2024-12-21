package com.srinispice.CrudAppDemo.dao;

import com.srinispice.CrudAppDemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDaoJpaImpl implements EmployeeDao{

    private final EntityManager enititymanager;

    @Autowired
    public EmployeeDaoJpaImpl(EntityManager theEntityManager) {
        enititymanager = theEntityManager;
    }

    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> theQuery = enititymanager.createQuery("from Employee",Employee.class);
        return theQuery.getResultList();
    }
}
