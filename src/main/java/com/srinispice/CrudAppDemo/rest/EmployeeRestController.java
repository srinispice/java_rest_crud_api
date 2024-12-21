package com.srinispice.CrudAppDemo.rest;

import com.srinispice.CrudAppDemo.dao.EmployeeDao;
import com.srinispice.CrudAppDemo.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    EmployeeDao theEmployeeDao;

    public EmployeeRestController(EmployeeDao theEmployeeDao) {
        this.theEmployeeDao = theEmployeeDao;
    }

    @GetMapping("/employees")
    public List<Employee> listEmployees(){
        return theEmployeeDao.findAll();
    }

}
