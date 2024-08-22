package me.essejacques.demand.repository;

import me.essejacques.demand.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}