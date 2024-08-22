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
public class Minister {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String name;
   private String slug;
   private String adresse;
   private String phone;
   private String fax;
   private String email;
   private String website;
   private String logo;

   @OneToMany(mappedBy = "minister")
   private Set<PublicService> publicServices;
}
