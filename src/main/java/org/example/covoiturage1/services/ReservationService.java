package org.example.covoiturage1.services;
import org.example.covoiturage1.entities.Reservation;
import org.example.covoiturage1.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    public Optional<Reservation> getReservationById(int id) {
        return reservationRepository.findById(id);
    }

    public Reservation createReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    public void deleteReservation(int id) {
        reservationRepository.deleteById(id);
    }

    public Reservation updateReservation(int id, Reservation reservation) {
        if (reservationRepository.existsById(id)) {
            reservation.setId_reservation(id);
            return reservationRepository.save(reservation);
        }
        return null;
    }
}
