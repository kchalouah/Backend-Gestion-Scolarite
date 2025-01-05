package com.springboot.projetggetionscolarite.controllers;

import com.springboot.projetggetionscolarite.entities.Enseignant;
import com.springboot.projetggetionscolarite.services.EnseignantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/enseignants")
@CrossOrigin(origins = "*") // Permet les requêtes depuis différentes origines, utile pour Angular
public class EnseignantController {

    @Autowired
    private EnseignantService enseignantService;

    // Ajouter ou mettre à jour un enseignant
    @PostMapping
    public ResponseEntity<Enseignant> saveEnseignant(@RequestBody Enseignant enseignant) {
        Enseignant savedEnseignant = enseignantService.saveEnseignant(enseignant);
        return ResponseEntity.ok(savedEnseignant);
    }

    // Récupérer tous les enseignants
    @GetMapping
    public ResponseEntity<List<Enseignant>> getAllEnseignants() {
        List<Enseignant> enseignants = enseignantService.getAllEnseignants();
        return ResponseEntity.ok(enseignants);
    }

    // Récupérer un enseignant par ID
    @GetMapping("/{id}")
    public ResponseEntity<Enseignant> getEnseignantById(@PathVariable Long id) {
        Enseignant enseignant = enseignantService.getEnseignantById(id);
        if (enseignant == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(enseignant);
    }

    // Supprimer un enseignant
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEnseignant(@PathVariable Long id) {
        enseignantService.deleteEnseignant(id);
        return ResponseEntity.noContent().build();
    }
}
