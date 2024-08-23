package me.essejacques.demand.services.interfaces;

import me.essejacques.demand.DTOs.SubCategoryProjection;

public interface SubCategoryService {

   SubCategoryProjection createSubCategory();

   SubCategoryProjection updateSubCategory();

   void deleteSubCategory();

   SubCategoryProjection getSubCategoryBySlug(String slug);

   SubCategoryProjection getSubCategoryById(Long id);

}