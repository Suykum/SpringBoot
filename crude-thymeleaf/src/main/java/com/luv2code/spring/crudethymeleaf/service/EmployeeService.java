package com.luv2code.spring.crudethymeleaf.service;

import com.luv2code.spring.crudethymeleaf.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    Employee findById(int id);
    void save(Employee employee);
    void deleteById(int id);
}
