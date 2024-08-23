package me.essejacques.demand.services.interfaces;

import java.util.List;

import org.springdoc.core.converters.models.Pageable;
import org.springframework.data.domain.Page;

import me.essejacques.demand.DTOs.PublicServiceDetailsProjection;
import me.essejacques.demand.requests.PublicServiceRequest;

public interface PublicServiceService {
   Page<PublicServiceDetailsProjection> getAllPublicServices(Pageable pageable);

   Page<PublicServiceDetailsProjection> filterPublicServices(Pageable pageable, Long categoryId, Long ministerId);

   List<PublicServiceDetailsProjection> getAllPublicServices();

   PublicServiceDetailsProjection getPublicServiceById(Long id);

   PublicServiceDetailsProjection getPublicServiceBySlug(String slug);

   PublicServiceDetailsProjection createPublicService(PublicServiceRequest publicServiceRequest);

   void updatePublicService(Long id, PublicServiceRequest publicServiceRequest);

   void deletePublicService(Long id);

}
