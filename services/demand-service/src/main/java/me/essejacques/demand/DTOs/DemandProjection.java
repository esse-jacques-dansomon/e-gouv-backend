package me.essejacques.demand.DTOs;

import me.essejacques.demand.enums.PublicServiceStatus;

import java.util.Map;

/**
 * Projection for {@link me.essejacques.demand.entities.Demand}
 */
public interface DemandProjection {
    Long getId();

    PublicServiceStatus getStatus();

    Long getUserId();

    Map<String, Object> getData();
}