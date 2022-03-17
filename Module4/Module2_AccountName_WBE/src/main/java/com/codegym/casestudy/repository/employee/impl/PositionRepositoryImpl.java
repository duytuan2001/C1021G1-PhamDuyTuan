package com.codegym.casestudy.repository.employee.impl;

import model.Position;
import repository.BaseRepository;
import repository.employee.IPositionRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PositionRepositoryImpl implements IPositionRepository {

    private static String SELECT_ALL_POSITION = "SELECT * FROM position";

    @Override
    public List<Position> findAll() {

        Connection connection = BaseRepository.getConnection();
        List<Position> positionList = new ArrayList<>();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(SELECT_ALL_POSITION);
                resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    int positionId = resultSet.getInt("position_id");
                    String positionName = resultSet.getString("position_name");
                    positionList.add(new Position(positionId, positionName));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return positionList;
    }
}
