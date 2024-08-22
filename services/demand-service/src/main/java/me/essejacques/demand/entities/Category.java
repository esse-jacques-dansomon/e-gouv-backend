package me.essejacques.demand.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Set;

@Entity
@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class Category {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String name;
   private String icon;
   private String slug;
   private String description;
   private Boolean isActive;
   @Enumerated(jakarta.persistence.EnumType.STRING)
   private String PublicServiceType;

   @OneToMany(mappedBy = "category")
   private Set<SubCategory> subCategories;
}
