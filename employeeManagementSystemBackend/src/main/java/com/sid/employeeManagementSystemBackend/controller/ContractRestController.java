package com.sid.employeeManagementSystemBackend.controller;


import com.sid.employeeManagementSystemBackend.entity.Contract;
import com.sid.employeeManagementSystemBackend.service.ContractServiceImpl;
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
@RequestMapping("api/contract/")
@Tag(name = "Contract", description = "Contract Operations")

public class ContractRestController {

            @Autowired
            private ContractServiceImpl contractService;
    @Operation(
            summary = "Create a new contract",
            description = "Adds a new contract with start date, end date, type, and an optional list of employees.",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Contract created successfully"),
                    @ApiResponse(responseCode = "400", description = "Invalid request data")
            }
    )

            @PostMapping("addContract")
    public Contract addContract(
            @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "Contract data to create",
                    required = true,
                    content = @Content(
                            schema = @Schema(implementation = Contract.class),
                            examples = @ExampleObject(
                                    value = """
                    {
                      "contractStartDate": "2024-06-01",
                      "contractEndDate": "2025-06-01",
                      "type": "CDI",
                      "employeeList": []
                    }
                    """
                            )
                    )
            )
            @RequestBody Contract contract
    ) {
        return contractService.addContract(contract);
    }

    @Operation(summary = "get all contract")
    @GetMapping("getAllContract")
            public List<Contract> getAllContract(){
                return contractService.getAllContract();
            }

    @Operation(summary = "get a contract by id")

    @GetMapping("getContractById/{id}")
            public Contract getContractById(@PathVariable("id") Long id){
                return contractService.getContractById(id);
            }

    @Operation(summary = "update  a specefic contract")
            @PutMapping("updateContract/{id}")
            public Contract updateContract(@PathVariable("id") Long id,@RequestBody Contract contract){
                return contractService.updateContract(id,contract);
            }
    @Operation(summary = "delete  a specefic contract")

    @DeleteMapping("deleteContract/{id}")
             public String deleteContract (@PathVariable("id") Long id) {
                return contractService.deleteContract(id);
            }













}
