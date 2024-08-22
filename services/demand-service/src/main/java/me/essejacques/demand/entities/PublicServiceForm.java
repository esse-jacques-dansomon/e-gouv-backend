package me.essejacques.demand.entities;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class PublicServiceForm {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   private String formCode;

   private String formName;

   @OneToMany(cascade = CascadeType.ALL, mappedBy = "publicServiceForm")
   private List<FormField> formFields;

   @Temporal(TemporalType.TIMESTAMP)
   private Date dateCreated;

   @Temporal(TemporalType.TIMESTAMP)
   private Date dateUpdated;

   @OneToOne
   @JoinColumn(name = "public_service_id")
   private PublicService publicService;
}
