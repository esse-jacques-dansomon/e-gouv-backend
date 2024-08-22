package me.essejacques.demand.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import me.essejacques.demand.enums.PublicServiceStatus;

import java.util.Set;

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

   private String slug;

   private String description;

   private Integer executionDelay;

   private Double fees;

   private Integer serviceDelay;

   private Boolean isActive;

   private Boolean isOnline;


   @ManyToOne
   @JoinColumn(name = "subcategory_id")
   private SubCategory subCategory;

   @ManyToOne
   @JoinColumn(name = "minister_id")
   private Minister minister;

   @OneToMany(mappedBy = "publicService")
   private Set<PublicServiceRequest> publicServiceRequests;

   @OneToOne(cascade = CascadeType.ALL)
   private PublicServiceForm publicServiceForm;

}
