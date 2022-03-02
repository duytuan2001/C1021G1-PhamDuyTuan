package service.contract;

import model.Contract;

import java.util.List;

public interface IContractService {

    List<Contract> getAllContract();

    void saveContract(Contract contract);

    Contract findByContract(int codeContract);

    void updateContract(Contract contract);

}
