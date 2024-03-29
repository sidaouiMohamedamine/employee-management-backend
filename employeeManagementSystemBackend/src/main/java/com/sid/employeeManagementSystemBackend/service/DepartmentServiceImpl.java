package com.sid.employeeManagementSystemBackend.service;


import com.sid.employeeManagementSystemBackend.entity.Department;
import com.sid.employeeManagementSystemBackend.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements IDepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;


    @Override
    public Department addDepartment(Department department) {
        return null;
    }

    @Override
    public List<Department> getAllDepartment() {
        return null;
    }

    @Override
    public Department getDepartmentById(Long id) {
        return null;
    }

    @Override
    public Department updateDepartment(Long id, Department department) {
        return null;
    }

    @Override
    public String deleteDepartment(Long id) {
        return null;
    }
}
