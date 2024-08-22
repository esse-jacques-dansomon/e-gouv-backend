package me.essejacques.citizen.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "citizen")
public class Citizen {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

}