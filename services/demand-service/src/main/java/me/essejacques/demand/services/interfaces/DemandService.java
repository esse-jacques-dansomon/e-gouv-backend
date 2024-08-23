package me.essejacques.demand.services.interfaces;

import java.util.List;

import org.springdoc.core.converters.models.Pageable;
import org.springframework.data.domain.Page;
import me.essejacques.demand.requests.DemandRequest;
import me.essejacques.demand.DTOs.DemandProjection;

public interface DemandService {

   Page<DemandProjection> getAllDemands(Pageable pageable);

   List<DemandProjection> getAllDemands();

   List<DemandProjection> getDemandsByUserId(Long userId);

   List<DemandProjection> getDemandByPublicServiceId(Long publicServiceId);

   List<DemandProjection> getDemandByStatus(String status);

   DemandProjection createDemand(DemandRequest demandRequest);

   DemandProjection updateDemand(Long id, DemandRequest demandRequest);

   void deleteDemand(Long id);

   DemandProjection getDemandById(Long id);

}
