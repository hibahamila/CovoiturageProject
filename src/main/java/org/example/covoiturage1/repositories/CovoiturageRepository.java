package org.example.covoiturage1.repositories;

import org.example.covoiturage1.entities.Covoiturage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CovoiturageRepository  extends JpaRepository<Covoiturage, Integer> {
}
