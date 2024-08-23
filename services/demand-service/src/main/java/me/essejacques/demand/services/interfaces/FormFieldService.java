package me.essejacques.demand.services.interfaces;

import java.util.List;
import me.essejacques.demand.DTOs.FormFieldProjection;
import me.essejacques.demand.requests.FormFieldRequest;

public interface FormFieldService {
   List<FormFieldProjection> getAllFormFields();

   FormFieldProjection getFormFieldById(Long id);

   FormFieldProjection createFormField(FormFieldRequest formFieldRequest);

   void updateFormField(Long id, FormFieldRequest formFieldRequest);

   void deleteFormField(Long id);
}