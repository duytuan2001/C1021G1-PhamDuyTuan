package com.codegym.casestudy.repository.contract;


import model.Contract;

import java.util.List;

public interface IContractRepository {

    List<Contract> getAllContract();

    void saveContract(Contract contract);

    Contract findByContract(int codeContract);

    void updateContract(Contract contract);
}
