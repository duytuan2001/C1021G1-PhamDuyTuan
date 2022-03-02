package repository.product.impl;

import model.Product;
import repository.BaseRepository;
import repository.product.IProductRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements IProductRepository {

    private BaseRepository baseRepository = new BaseRepository();

    private static String SELECT_ALL_PRODUCT = "select * from product join category on product.category_id = category.category_id;";

    @Override
    public List<Product> getAllProduct() {
        Connection connection = baseRepository.getConnection();
        List<Product> productList = new ArrayList<>();
        ResultSet resultSet;
        PreparedStatement preparedStatement;

        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(SELECT_ALL_PRODUCT);
                resultSet = preparedStatement.executeQuery();
                Product product;
                while (resultSet.next()) {
                    product = new Product();
                    product.setIdProduct(resultSet.getInt("product_id"));
                    product.setNameProduct(resultSet.getString("product_name"));
                    product.setPrice(resultSet.getDouble("price"));
                    product.setQuality(resultSet.getInt("quality"));
                    product.setColor(resultSet.getString("color"));
                    product.setNameCategory(resultSet.getString("category_name"));

                    productList.add(product);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        return productList;
    }

    @Override
    public void createProduct(Product product) {
        Connection connection = BaseRepository.getConnection();
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement("insert into product(product_name, price, quantity, color, category_id) value (?,?,?,?,?)");
                preparedStatement.setString(1, product.getNameProduct());
                preparedStatement.setDouble(2, product.getPrice());
                preparedStatement.setInt(3, product.getQuality());
                preparedStatement.setString(4, product.getColor());
                preparedStatement.setInt(5, product.getIdCategory());

                preparedStatement.executeUpdate();
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
    }

    @Override
    public Product findById(int id) {
        Product product= null;
        Connection connection = BaseRepository.getConnection();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement("select * from product where product_id = ?;");
                preparedStatement.setInt(1, id);
                resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    product = new Product();
                    product.setIdProduct(id);
                    product.setNameProduct(resultSet.getString("product_name"));
                    product.setPrice(resultSet.getDouble("price"));
                    product.setQuality(resultSet.getInt("quality"));
                    product.setColor(resultSet.getString("color"));
                    product.setIdCategory(resultSet.getInt("category_id"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        return product;
    }



    @Override
    public void updateProduct(Product product) {
        Connection connection = BaseRepository.getConnection();
        PreparedStatement preparedStatement;
        if (connection != null) {
            try {
                product = new Product();
                preparedStatement = connection.prepareStatement("update customer set  product_name = ?, price = ?, quality = ?, color = ?, category_id= ? where product_id = ?");

                preparedStatement.setString(1, product.getNameProduct());
                preparedStatement.setDouble(2, product.getPrice());
                preparedStatement.setInt(3, product.getQuality());
                preparedStatement.setString(4, product.getColor());
                preparedStatement.setInt(5, product.getIdCategory());

                preparedStatement.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void deleteProduct(int id) {
        Connection connection = BaseRepository.getConnection();
        PreparedStatement preparedStatement = null;
        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement("delete from product where product_id = ?;");
                preparedStatement.setInt(1, id);
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }

    @Override
    public List<Product> searchProduct(String name) {
        return null;
    }
}
