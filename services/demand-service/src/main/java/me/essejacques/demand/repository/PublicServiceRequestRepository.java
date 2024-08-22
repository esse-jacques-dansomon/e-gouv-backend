package me.essejacques.demand.repository;

import me.essejacques.demand.entities.PublicServiceRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublicServiceRequestRepository extends JpaRepository<PublicServiceRequest, Long> {
}