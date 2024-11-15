package org.example.covoiturage1.services;
import org.example.covoiturage1.entities.Covoiturage;
import org.example.covoiturage1.repositories.CovoiturageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CovoiturageService {

    @Autowired
    private CovoiturageRepository covoiturageRepository;

    public List<Covoiturage> getAllCovoiturages() {
        return covoiturageRepository.findAll();
    }


    public Optional<Covoiturage> getCovoiturageById(int id) {
        return covoiturageRepository.findById(id);
    }

    public Covoiturage createCovoiturage(Covoiturage covoiturage) {
        return covoiturageRepository.save(covoiturage);
    }

    public void deleteCovoiturage(int id) {
        covoiturageRepository.deleteById(id);
    }

    public Covoiturage updateCovoiturage(int id, Covoiturage covoiturage) {
        if (covoiturageRepository.existsById(id)) {
            covoiturage.setId_covoiturage(id);
            return covoiturageRepository.save(covoiturage);
        }
        return null;
    }
}

