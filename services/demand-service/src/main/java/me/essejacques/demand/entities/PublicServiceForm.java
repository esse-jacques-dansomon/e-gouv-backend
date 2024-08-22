package me.essejacques.demand.entities;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
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

   @Temporal(TemporalType.TIMESTAMP)
   private Date dateCreated;

   @Temporal(TemporalType.TIMESTAMP)
   private Date dateUpdated;

   @OneToMany(cascade = CascadeType.ALL, mappedBy = "formulaire")
   private List<FormField> composants;
}
