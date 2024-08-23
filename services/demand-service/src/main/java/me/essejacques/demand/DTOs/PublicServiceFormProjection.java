package me.essejacques.demand.DTOs;

import java.sql.Date;

/**
 * Projection for {@link me.essejacques.demand.entities.PublicServiceForm}
 */
public interface PublicServiceFormProjection {
    Long getId();

    String getFormCode();

    String getFormName();

    Date getDateCreated();

    Date getDateUpdated();
}