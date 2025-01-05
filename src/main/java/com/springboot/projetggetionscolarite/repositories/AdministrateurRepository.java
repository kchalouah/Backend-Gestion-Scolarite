package com.springboot.projetggetionscolarite.repositories;

import com.springboot.projetggetionscolarite.entities.Administrateur;
import com.springboot.projetggetionscolarite.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministrateurRepository extends JpaRepository<Administrateur, Long> {

}
