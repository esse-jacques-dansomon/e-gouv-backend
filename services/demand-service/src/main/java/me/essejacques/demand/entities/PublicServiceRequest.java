package me.essejacques.demand.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import me.essejacques.demand.enums.PublicServiceStatus;

import java.util.Map;


@Entity
@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class PublicServiceRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(jakarta.persistence.EnumType.STRING)
    private PublicServiceStatus status;

    private Long userId;

    @ElementCollection
    private Map<String, Object> data;

    @ManyToOne
    @JoinColumn(name = "public_service_id")
    private PublicService publicService;
}
