package org.example.covoiturage1.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_reservation	;

    /*@ManyToOne
    @JoinColumn(name = "id_passager", nullable = false)
   // private Passager passager;

    @ManyToOne
    @JoinColumn(name = "id_covoiturage", nullable = false)*/
    //private Covoiturage covoiturage;

    @Enumerated(EnumType.STRING)
    private StatutReservation statut;

    @NotNull
    private int nb_place_reservees;

    public enum StatutReservation {
        CONFIRMEE, EN_ATTENTE, ANNULLEE
    }


}
