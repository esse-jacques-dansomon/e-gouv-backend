package me.essejacques.demand.DTOs;

import java.util.Set;

/**
 * Projection for {@link me.essejacques.demand.entities.Category}
 */
public interface CategoryProjection {
    Long getId();

    String getName();

    String getIcon();

    String getSlug();

    String getDescription();

    Boolean isIsActive();

    String getPublicServiceType();

    Set<SubCategoryProjection> getSubCategories();
}