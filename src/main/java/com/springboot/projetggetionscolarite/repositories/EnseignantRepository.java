package com.springboot.projetggetionscolarite.repositories;

import com.springboot.projetggetionscolarite.entities.Administrateur;
import com.springboot.projetggetionscolarite.entities.Enseignant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnseignantRepository extends JpaRepository<Enseignant, Long> {
    Enseignant findByUsername(String username); // Exemple de méthode personnalisée
}
