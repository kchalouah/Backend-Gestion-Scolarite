package com.springboot.projetggetionscolarite.repositories;

import com.springboot.projetggetionscolarite.entities.Absence;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AbsenceRepository extends JpaRepository<Absence, Long> {
}
