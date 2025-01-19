package com.springBootLearn.employee.service;

import org.springframework.stereotype.Service;

import com.springBootLearn.employee.model.Employee;
import com.springBootLearn.employee.repository.EmployeeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeService {

private final EmployeeRepository employeeRepository;

public Employee postEmployee(Employee employee){
    return employeeRepository.save(employee);
}

}
