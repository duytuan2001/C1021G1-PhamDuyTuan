package repository.contract.impl;

import model.Contract;
import repository.BaseRepository;
import repository.contract.IContractRepository;
import java.util.List;

public class ContractRepository implements IContractRepository {
    private BaseRepository baseRepository = new BaseRepository();

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
