package ir.maktab.service;

import ir.maktab.domains.account.Account;
import ir.maktab.domains.account.post.Category;
import ir.maktab.repository.impl.CategoryRepositoryImpl;

import java.util.List;

public class CategoryService {
    CategoryRepositoryImpl categoryRepository = CategoryRepositoryImpl.getInstance();

   /* public List<Category> showCategories(Account account){
        return  account.getCategories();
    }
*/
    public Category getCategory(Long id){
        return categoryRepository.getCategories(id);
    }

    public Category generateCategory(String categoryName){
        return categoryRepository.addNewCategory(categoryName);
    }
}
