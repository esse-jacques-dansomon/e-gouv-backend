package me.essejacques.demand.repository;

import me.essejacques.demand.entities.FormField;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormFieldRepository extends JpaRepository<FormField, Long> {
}