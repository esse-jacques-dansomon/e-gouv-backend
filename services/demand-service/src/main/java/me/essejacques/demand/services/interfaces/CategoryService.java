package me.essejacques.demand.services.interfaces;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import me.essejacques.demand.DTOs.CategoryProjection;
import me.essejacques.demand.requests.CategoryRequest;

public interface CategoryService {

   Page<CategoryProjection> getAllCategories(Pageable pageable);

   List<CategoryProjection> getAllCategories();

   void createCategory(CategoryRequest categoryRequest);

   CategoryProjection getCategoryById(Long id);

   CategoryProjection getCategoryBySlug(String slug);

   void updateCategory(Long id, CategoryRequest categoryRequest);

   void deleteCategory(Long id);

}
