package service.employee.impl;

import model.Position;
import repository.employee.IPositionRepository;
import repository.employee.impl.PositionRepositoryImpl;
import service.employee.IPositionService;

import java.util.List;

public class PositionServiceImpl implements IPositionService {
    private IPositionRepository IPositionRepository = new PositionRepositoryImpl();

    @Override
    public List<Position> findAll() {
        return IPositionRepository.findAll();
    }
}
