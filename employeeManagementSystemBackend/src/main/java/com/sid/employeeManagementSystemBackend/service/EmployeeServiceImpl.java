package com.sid.employeeManagementSystemBackend.service;

import com.sid.employeeManagementSystemBackend.entity.Employee;
import com.sid.employeeManagementSystemBackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public Employee addEmployee(Employee employee) {
        return null;
    }

    @Override
    public List<Employee> getAllEmployee() {
        return null;
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return null;
    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {
        return null;
    }

    @Override
    public String deleteEmployee(Long id) {
        return null;
    }
}
