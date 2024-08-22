package me.essejacques.citizen.repository;

import me.essejacques.citizen.entity.EID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EIDRepository extends JpaRepository<EID, Long> {
}