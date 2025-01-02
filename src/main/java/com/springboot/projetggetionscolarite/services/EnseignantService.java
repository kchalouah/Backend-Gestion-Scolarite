package com.springboot.projetggetionscolarite.services;

import com.springboot.projetggetionscolarite.entities.Enseignant;
import com.springboot.projetggetionscolarite.repositories.EnseignantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnseignantService {

    @Autowired
    private EnseignantRepository enseignantRepository;

    // Ajouter ou mettre à jour un enseignant
    public Enseignant saveEnseignant(Enseignant enseignant) {
        return enseignantRepository.save(enseignant);
    }

    // Récupérer tous les enseignants
    public List<Enseignant> getAllEnseignants() {
        return enseignantRepository.findAll();
    }

    // Récupérer un enseignant par ID
    public Enseignant getEnseignantById(Long id) {
        return enseignantRepository.findById(id).orElse(null);
    }

    // Supprimer un enseignant
    public void deleteEnseignant(Long id) {
        enseignantRepository.deleteById(id);
    }
}
