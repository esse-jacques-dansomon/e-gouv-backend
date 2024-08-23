package me.essejacques.demand.DTOs;

/**
 * Projection for {@link me.essejacques.demand.entities.PublicService}
 */
public interface PublicServiceProjection {
    Long getId();

    String getName();

    String getSlug();

    String getDescription();

    Integer getExecutionDelay();

    Double getFees();

    Integer getServiceDelay();

    Boolean isIsActive();

    Boolean isIsOnline();
}