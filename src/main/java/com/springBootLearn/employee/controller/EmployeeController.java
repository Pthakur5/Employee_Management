package com.springBootLearn.employee.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springBootLearn.employee.model.Employee;
import com.springBootLearn.employee.service.EmployeeService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;
    
    @PostMapping("/employee")
    public Employee postEmployee(@RequestBody Employee employee ){

        return employeeService.postEmployee(employee);
    }

}
