package com.sid.employeeManagementSystemBackend.service;


import com.sid.employeeManagementSystemBackend.entity.Contract;
import com.sid.employeeManagementSystemBackend.repository.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractServiceImpl implements IContractService{

    @Autowired
    private ContractRepository contractRepository;


    @Override
    public Contract addContract(Contract contract) {
        return null;
    }

    @Override
    public List<Contract> getAllContract() {
        return null;
    }

    @Override
    public Contract getContractById(Long id) {
        return null;
    }

    @Override
    public Contract updateContract(Long id, Contract contract) {
        return null;
    }

    @Override
    public String deleteContract(Long id) {
        return null;
    }
}
