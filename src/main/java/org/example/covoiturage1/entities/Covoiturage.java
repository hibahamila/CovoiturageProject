package org.example.covoiturage1.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Entity
@Data
public class Covoiturage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_covoiturage;

    @NotNull
    private String ville_depart;

    @NotNull
    private String ville_arrive;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")  // Utilisation de @DateTimeFormat
    private LocalDateTime date_depart;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime date_arrive;

    @Enumerated(EnumType.STRING)
    private TypeRoute type_route;

    @NotNull
    private int nombre_place;

    public enum TypeRoute {
        AUTOROUTE, ROUTE_NATIONALE, VOIE_RAPIDE, AUTRE
    }
}
