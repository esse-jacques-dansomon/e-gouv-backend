package me.essejacques.demand.services.interfaces;

import me.essejacques.demand.DTOs.PublicServiceFormProjection;

public interface PublicServiceFormService {

   PublicServiceFormProjection getPublicServiceFormById(Long id);

   PublicServiceFormProjection getPublicServiceFormByPublicServiceId(Long publicServiceId);

   PublicServiceFormProjection createPublicServiceForm(PublicServiceFormProjection publicServiceFormProjection);

   void updatePublicServiceForm(Long id, PublicServiceFormProjection publicServiceFormProjection);

   void deletePublicServiceForm(Long id);

}
