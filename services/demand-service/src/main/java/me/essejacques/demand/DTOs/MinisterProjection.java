package me.essejacques.demand.DTOs;

/**
 * Projection for {@link me.essejacques.demand.entities.Minister}
 */
public interface MinisterProjection {
    Long getId();

    String getName();

    String getSlug();

    String getAdresse();

    String getPhone();

    String getFax();

    String getEmail();

    String getWebsite();

    String getLogo();
}