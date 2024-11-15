package org.example.covoiturage1.controllers;

import lombok.AllArgsConstructor;
import org.example.covoiturage1.entities.Covoiturage;
import org.example.covoiturage1.services.CovoiturageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/covoiturages")
@AllArgsConstructor

public class CovoiturageController {
    private final CovoiturageService covoiturageService;




    @GetMapping
    public List<Covoiturage> getAllCovoiturages() {
        return covoiturageService.getAllCovoiturages();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Covoiturage> getCovoiturageById(@PathVariable int id) {
        Optional<Covoiturage> covoiturage = covoiturageService.getCovoiturageById(id);
        return covoiturage.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Covoiturage> createCovoiturage(@RequestBody Covoiturage covoiturage) {
        Covoiturage createdCovoiturage = covoiturageService.createCovoiturage(covoiturage);
        return new ResponseEntity<>(createdCovoiturage, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Covoiturage> updateCovoiturage(@PathVariable int id, @RequestBody Covoiturage covoiturage) {
        Covoiturage updatedCovoiturage = covoiturageService.updateCovoiturage(id, covoiturage);
        return updatedCovoiturage != null ? ResponseEntity.ok(updatedCovoiturage) : ResponseEntity.notFound().build();
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCovoiturage(@PathVariable int id) {
        covoiturageService.deleteCovoiturage(id);
        return ResponseEntity.noContent().build();
    }
}

