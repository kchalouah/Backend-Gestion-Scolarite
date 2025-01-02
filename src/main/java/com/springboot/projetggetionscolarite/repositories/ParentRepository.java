package com.springboot.projetggetionscolarite.repositories;

import com.springboot.projetggetionscolarite.entities.Administrateur;
import com.springboot.projetggetionscolarite.entities.Parent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParentRepository extends JpaRepository<Parent, Long> {
    Parent findByUsername(String username); // Exemple de méthode personnalisée
}
