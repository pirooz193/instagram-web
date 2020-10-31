package ir.maktab.repository;

import ir.maktab.domains.account.post.Category;

public interface CategoryRepository {

    Category addNewCategory(String categoryName);
    Category getCategories(Long id);
}
