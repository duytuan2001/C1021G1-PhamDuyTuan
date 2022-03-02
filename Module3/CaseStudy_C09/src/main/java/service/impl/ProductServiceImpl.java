package service.impl;

import model.Product;
import repository.product.ICategoryRepository;
import repository.product.IProductRepository;
import repository.product.impl.ProductRepositoryImpl;
import service.IProductService;

import java.util.List;

public class ProductServiceImpl implements IProductService {
    private static IProductRepository iProductRepository = new ProductRepositoryImpl();

    @Override
    public List<Product> getAllProduct() {
        List<Product> productList = iProductRepository.getAllProduct();
        if (productList.size() == 0) {
            return null;
        }
        return iProductRepository.getAllProduct();
    }

    @Override
    public void createProduct(Product product) {
        iProductRepository.createProduct(product);
    }

    @Override
    public void updateProduct(Product product) {
        iProductRepository.updateProduct(product);
    }

    @Override
    public Product findById(int id) {
        return iProductRepository.findById(id);
    }

    @Override
    public void deleteProduct(int id) {

    }

    @Override
    public List<Product> searchProduct(String name) {
        return null;
    }
}
