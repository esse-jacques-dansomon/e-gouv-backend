package me.essejacques.demand.DTOs;

import java.util.List;

/**
 * Projection for {@link me.essejacques.demand.entities.FormField}
 */
public interface FormFieldProjection {
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

    List<FormFieldSimpleProjection> getSubComponents();


}