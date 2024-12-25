package com.srinispice.CrudAppDemo.rest;

import com.srinispice.CrudAppDemo.dao.EmployeeDao;
import com.srinispice.CrudAppDemo.entity.Employee;
import com.srinispice.CrudAppDemo.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private final EmployeeService employeeService;

    public EmployeeRestController(EmployeeService theEmployeeService) {
        this.employeeService = theEmployeeService;
    }

    @GetMapping("/employees")
    public List<Employee> listAllEmployee(){
        return employeeService.findAll();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        return employeeService.findById(id);
    }

    @PostMapping("/employees")
    public Employee saveEmployees(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable int id){
        employeeService.deleteEmployee(id);
    }
}
