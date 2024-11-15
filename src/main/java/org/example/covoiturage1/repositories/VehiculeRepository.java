package org.example.covoiturage1.repositories;

import org.example.covoiturage1.entities.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface VehiculeRepository extends JpaRepository<Vehicule, Integer> {
    /*List<Vehicule> findByEtat(Vehicule.EtatVehicule etat );
    List<Vehicule> findByType(String type);
    Optional<Vehicule> findByNumMatricule(String numMatricule);
    List<Vehicule> findByDegreConfortBetween(int minConfort, int maxConfort);
    List<Vehicule> findByTypeAndEtat(String type, Vehicule.EtatVehicule etat);
    List<Vehicule> findByEtatAndDegreConfortGreaterThanEqual(Vehicule.EtatVehicule etat, int confortMin);
    List<Vehicule> findByTypeAndDegreConfortGreaterThanEqual(String type, int confortMin);*/

}
