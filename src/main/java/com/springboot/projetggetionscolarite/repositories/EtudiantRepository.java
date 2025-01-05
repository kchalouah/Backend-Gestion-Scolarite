package com.springboot.projetggetionscolarite.repositories;

import com.springboot.projetggetionscolarite.entities.Administrateur;
import com.springboot.projetggetionscolarite.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {

}
