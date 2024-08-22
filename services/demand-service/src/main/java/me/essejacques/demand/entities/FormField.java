package me.essejacques.demand.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class FormField {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   private String label;
   private String model;
   private boolean editable;
   private boolean required;
   private String componentType;
   private String description;
   private String placeholder;
   private String labelPosition;
   private Integer minDate;

   @ElementCollection
   private List<String> options;

   @ManyToOne
   @JoinColumn(name = "formulaire_id")
   private PublicServiceForm formulaire;

   @OneToMany(cascade = CascadeType.ALL)
   @JoinColumn(name = "parent_id")
   private List<FormField> subComponents;

   // @OneToOne(cascade = CascadeType.ALL)
   // private Message message;

   // @OneToOne(cascade = CascadeType.ALL)
   // private Showable showable;

   // Getters, Setters, Constructors
}
