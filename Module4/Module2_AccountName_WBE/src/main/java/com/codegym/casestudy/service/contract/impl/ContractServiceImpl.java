package com.codegym.casestudy.service.contract.impl;

import model.Contract;
import repository.contract.IContractRepository;
import repository.contract.impl.ContractRepository;
import service.contract.IContractService;

import java.util.List;

public class ContractServiceImpl implements IContractService {

    private static IContractRepository iContractRepository = new ContractRepository();


    @Override
    public List<Contract> getAllContract() {
        return null;
    }

    @Override
    public void saveContract(Contract contract) {

    }

    @Override
    public Contract findByContract(int codeContract) {
        return null;
    }

    @Override
    public void updateContract(Contract contract) {

    }
}
