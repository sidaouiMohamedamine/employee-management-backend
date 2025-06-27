package com.sid.employeeManagementSystemBackend.controller;


import com.sid.employeeManagementSystemBackend.entity.Department;
import com.sid.employeeManagementSystemBackend.service.DepartmentServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/department/")
@Tag(name = "Departement", description = "Departement Operations")

public class DepartementRestController {

    @Autowired
    private DepartmentServiceImpl departmentService;

    @Operation(
            summary = "Create a new department",
            description = "Adds a new department with a name, description, and an optional list of employees.",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Department created successfully"),
                    @ApiResponse(responseCode = "400", description = "Invalid request data")
            }
    )

    @PostMapping("addDepartment")
    public Department addDepartment(
            @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "Department data to be created",
                    required = true,
                    content = @Content(
                            schema = @Schema(implementation = Department.class),
                            examples = @ExampleObject(
                                    value = """
                    {
                      "name": "Finance",
                      "description": "Handles company finances",
                      "employeeList": []
                    }
                    """
                            )
                    )
            )
            @RequestBody Department department
    ) {
        return departmentService.addDepartment(department);
    }

    @Operation(summary = "Retreive all departements")
    @GetMapping("getAllDepartment")
    public List<Department> getAllDepartment(){
        return departmentService.getAllDepartment();
    }

    @Operation(summary = "Retreive departement by Id")
    @GetMapping("getDepartmentById/{id}")
    public Department getDepartmentById(@PathVariable("id") Long id){
        return departmentService.getDepartmentById(id);
    }

    @Operation(summary = "update departement")
    @PutMapping("updateDepartment/{id}")
    public Department updateDepartment(@PathVariable("id") Long id,@RequestBody Department department){
        return departmentService.updateDepartment(id,department);
    }
    @Operation(summary = "delete departement")

    @DeleteMapping("deleteDepartment/{id}")
    public String deleteDepartment(@PathVariable("id") Long id){
        return departmentService.deleteDepartment(id);
    }






}
