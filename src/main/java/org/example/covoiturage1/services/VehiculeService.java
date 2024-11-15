package org.example.covoiturage1.services;
import org.example.covoiturage1.entities.Vehicule;
import org.example.covoiturage1.repositories.VehiculeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class VehiculeService {
    // Injection du repository pour interagir avec la base de données

    private final VehiculeRepository vehiculeRepository;

    // Constructeur pour l'injection du repository
    @Autowired   //l'annotation @Autowired dans le constructeur permet à Spring
    // d'injecter automatiquement une instance de VehiculeRepository
    // lorsque l'instance de VehiculeService est créée.

    public VehiculeService(VehiculeRepository vehiculeRepository) {
        this.vehiculeRepository = vehiculeRepository;
    }


    // Méthode pour créer un nouveau véhicule
    public Vehicule createVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);  // Cela retourne un objet de type Vehicule
    }

    // Méthode pour obtenir un véhicule par son identifiant
    public Optional<Vehicule> getVehiculeById(int id) {
        return vehiculeRepository.findById(id);
    }

    public List<Vehicule> getAllVehicules() {
        return vehiculeRepository.findAll();
    }



    // Méthode pour mettre à jour un véhicule
    public Vehicule UpdateVehicule(int id, Vehicule vehicule) {
        Optional<Vehicule> vehiculeExist = vehiculeRepository.findById(id);
        if (vehiculeExist.isPresent()) {
            Vehicule vehiculeToUpdate = vehiculeExist.get();
            vehiculeToUpdate.setType(vehicule.getType());
            vehiculeToUpdate.setImage(vehicule.getImage());
            vehiculeToUpdate.setNum_matricule(vehicule.getNum_matricule());
            vehiculeToUpdate.setEtat(vehicule.getEtat());
            vehiculeToUpdate.setDegre_confort(vehicule.getDegre_confort());
            return vehiculeRepository.save(vehiculeToUpdate);
        } else {
            // Gestion d'erreur si le véhicule n'existe pas
            return null;
        }
    }

    // Méthode pour supprimer un véhicule
    public boolean DeleteVehicule(int id) {
        Optional<Vehicule> vehicule = vehiculeRepository.findById(id);
        if (vehicule.isPresent()) {
            vehiculeRepository.deleteById(id);
            return true;
        } else {
            return false; // Le véhicule n'existe pas
        }
    }


}