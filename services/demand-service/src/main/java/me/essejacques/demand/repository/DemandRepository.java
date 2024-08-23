package me.essejacques.demand.repository;

import me.essejacques.demand.entities.Demand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemandRepository extends JpaRepository<Demand, Long> {
}