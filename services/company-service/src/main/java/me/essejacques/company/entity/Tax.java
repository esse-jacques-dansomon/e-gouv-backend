package me.essejacques.company.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tax")
public class Tax {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

}