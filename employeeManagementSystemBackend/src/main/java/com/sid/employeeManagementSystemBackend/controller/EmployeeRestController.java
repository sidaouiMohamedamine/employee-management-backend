package com.sid.employeeManagementSystemBackend.controller;


import com.sid.employeeManagementSystemBackend.entity.Employee;
import com.sid.employeeManagementSystemBackend.service.EmployeeServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin("*")
@RestController
@RequestMapping("api/employee/")
@Tag(name = "Employee", description = "Employee Operations")
public class EmployeeRestController {

        @Autowired
        private EmployeeServiceImpl employeeService;

        @Operation(
                summary = "Create new employee",
                description = "Create a new employee in the database",
                responses = {
                        @ApiResponse(responseCode = "200", description = "Employee created successfully"),
                        @ApiResponse(responseCode = "400", description = "Invalid Request")
                }
        )

        @PostMapping("addEmployee")
        public ResponseEntity<Employee> createEmployee(
                @io.swagger.v3.oas.annotations.parameters.RequestBody(
                        description = "Employee data",
                        required = true,
                        content = @Content(
                                schema = @Schema(implementation = Employee.class),
                                examples = @ExampleObject(
                                        value = """
                    {
                      "firstName": "sidaoui",
                      "lastName": "Mohamed Amine",
                      "email": "mssidaoui@gmail.com"
                    }
                    """
                                )
                        )
                )
                @RequestBody Employee employee
        ) {
                return ResponseEntity.ok(employeeService.addEmployee(employee));
        }

        @Operation(summary = "Retreive all employee")
        @GetMapping("getAllEmployee")
        public List<Employee> getAllEmployee(){
            return employeeService.getAllEmployee();
        }

        @Operation(summary = "Retreive an employee by Id")
        @GetMapping("getEmployeeById/{id}")
        public Employee getEmployeeById(@PathVariable("id") Long id){
                return employeeService.getEmployeeById(id);
        }

        @Operation(summary = "Update an employee")
        @PutMapping("updateEmployee/{id}")
        public Employee updateEmployee(@PathVariable("id") Long id,@RequestBody Employee employee){
                return  employeeService.updateEmployee(id,employee);
        }
        @Operation(summary = "Delete an employee")

        @DeleteMapping("deleteEmployee/{id}")
        public ResponseEntity<Void> deleteEmployee(@PathVariable Long id){
                return employeeService.deleteEmployee(id);
        }

        @Operation(summary = "Get Employee Number")
        @GetMapping("getEmployeeNumber")
        public Integer getEmployeeNumber(){
                return employeeService.getEmployeeNumber();
        }




}
