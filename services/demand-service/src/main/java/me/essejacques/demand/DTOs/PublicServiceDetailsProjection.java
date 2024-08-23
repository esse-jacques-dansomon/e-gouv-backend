package me.essejacques.demand.DTOs;

/**
 * Projection for {@link me.essejacques.demand.entities.PublicService}
 */
public interface PublicServiceDetailsProjection extends PublicServiceProjection {
    SubCategoryProjection getSubCategory();

    MinisterProjection getMinister();

    PublicServiceFormProjection getPublicServiceForm();
}