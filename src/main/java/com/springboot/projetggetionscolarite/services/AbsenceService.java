package com.springboot.projetggetionscolarite.services;

import com.springboot.projetggetionscolarite.entities.Absence;
import com.springboot.projetggetionscolarite.repositories.AbsenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AbsenceService {
    @Autowired
    private AbsenceRepository absenceRepository;

    public List<Absence> getAllAbsences() {
        return absenceRepository.findAll();
    }

    public Optional<Absence> getAbsenceById(Long id) {
        return absenceRepository.findById(id);
    }

    public Absence saveAbsence(Absence absence) {
        return absenceRepository.save(absence);
    }

    public void deleteAbsence(Long id) {
        absenceRepository.deleteById(id);
    }
}