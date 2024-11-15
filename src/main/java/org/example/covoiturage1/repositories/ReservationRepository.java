package org.example.covoiturage1.repositories;

import org.example.covoiturage1.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository  extends JpaRepository<Reservation, Integer> {
}
