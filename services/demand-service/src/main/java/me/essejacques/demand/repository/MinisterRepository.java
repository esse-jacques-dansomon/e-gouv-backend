package me.essejacques.demand.repository;

import me.essejacques.demand.entities.Minister;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MinisterRepository extends JpaRepository<Minister, Long> {
}