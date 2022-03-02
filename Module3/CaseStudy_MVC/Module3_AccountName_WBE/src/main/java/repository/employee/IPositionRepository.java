package repository.employee;

import model.Position;

import java.util.List;

public interface IPositionRepository {
    List<Position> findAll();
}
