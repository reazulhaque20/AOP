package com.example.aop.controller;

import com.example.aop.model.Employee;
import com.example.aop.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/allEmployee")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @GetMapping("/getEmployeeById/{id}")
    public Employee getEmployeeById(@PathVariable("id") Long id){
        return employeeService.getEmployeeById(id);
    }
}
