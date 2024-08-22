package me.essejacques.citizen.repository;

import me.essejacques.citizen.entity.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitizenRepository extends JpaRepository<Citizen, Long> {
}