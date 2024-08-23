package me.essejacques.demand.services.interfaces;

import java.util.List;

import org.springdoc.core.converters.models.Pageable;
import org.springframework.data.domain.Page;

import me.essejacques.demand.DTOs.MinisterProjection;
import me.essejacques.demand.requests.MinisterRequest;

public interface MinisterService {

   Page<MinisterProjection> getAllMinisters(Pageable pageable);

   List<MinisterProjection> getAllMinisters();

   MinisterProjection getMinisterById(Long id);

   MinisterProjection getMinisterBySlug(String slug);

   MinisterProjection createMinister(MinisterRequest ministerRequest);

   void updateMinister(Long id, MinisterRequest ministerRequest);

   void deleteMinister(Long id);

}
