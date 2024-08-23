package me.essejacques.demand.DTOs;

import java.util.List;

/**
 * Projection for {@link me.essejacques.demand.entities.FormField}
 */
public interface FormFieldSimpleProjection {
    Long getId();

    String getLabel();

    String getModel();

    boolean isEditable();

    boolean isRequired();

    String getComponentType();

    String getDescription();

    String getPlaceholder();

    String getLabelPosition();

    Integer getMinDate();

    List<String> getOptions();
}
