package service.impl;

import model.Category;
import repository.product.ICategoryRepository;
import repository.product.impl.CategoryRepositoryImpl;
import service.ICategoryService;

import java.util.List;

public class CategoryServiceImpl implements ICategoryService {

    private static ICategoryRepository iCategoryRepository = new CategoryRepositoryImpl();

    @Override
    public List<Category> getAllCategory() {
        return iCategoryRepository.getAllCategory();
    }
}
