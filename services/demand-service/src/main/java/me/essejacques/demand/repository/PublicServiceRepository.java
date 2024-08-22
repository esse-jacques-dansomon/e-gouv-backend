package me.essejacques.demand.repository;

import org.springframework.data.repository.CrudRepository;
import me.essejacques.demand.entities.PublicService;

public interface PublicServiceRepository extends CrudRepository<PublicService, Long> {
}