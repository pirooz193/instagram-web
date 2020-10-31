package ir.maktab.repository.impl;

import ir.maktab.domains.account.post.Category;
import ir.maktab.repository.CategoryRepository;
import ir.maktab.repository.base.BaseRepository;

public class CategoryRepositoryImpl extends BaseRepository<Category, Long> implements CategoryRepository {

    private static CategoryRepositoryImpl  categoryRepository;

    public static CategoryRepositoryImpl getInstance(){
        if (categoryRepository == null) categoryRepository = new CategoryRepositoryImpl();
        return categoryRepository;
    }

    @Override
    public Category addNewCategory(String categoryName) {
        Category category = new Category();
        try {
            category.setName(categoryName);
            save(category);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Category getCategories(Long id) {
        return load(id);
    }

    @Override
    protected Class<Category> getEntityClass() {
        return Category.class;
    }
}
