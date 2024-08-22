package me.essejacques.demand.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import me.essejacques.demand.enums.PublicServiceStatus;

@Entity
@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class PublicService {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   private String name;

   private String icon;

   private String slug;

   private String description;

   private Integer executionDelay;

   private Double fees;

   private Integer serviceDelay;

   private Boolean isActive;

   @Enumerated(jakarta.persistence.EnumType.STRING)
   private PublicServiceStatus status;

}
