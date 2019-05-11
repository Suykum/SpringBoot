package com.luv2code.springboot.crud.dao;

import com.luv2code.springboot.crud.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
    Employee findById(int id);
    void save(Employee employee);
    void delete(int id);
}
