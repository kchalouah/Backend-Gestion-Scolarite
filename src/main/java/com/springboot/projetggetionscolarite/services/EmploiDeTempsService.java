package com.springboot.projetggetionscolarite.services;

import com.springboot.projetggetionscolarite.entities.EmploiDeTemps;
import com.springboot.projetggetionscolarite.repositories.EmploiDeTempsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EmploiDeTempsService {
    @Autowired
    private EmploiDeTempsRepository emploiDeTempsRepository;

    public List<EmploiDeTemps> getAllEmploiDeTemps() {
        return emploiDeTempsRepository.findAll();
    }

    public Optional<EmploiDeTemps> getEmploiDeTempsById(Long id) {
        return emploiDeTempsRepository.findById(id);
    }

    public EmploiDeTemps saveEmploiDeTemps(EmploiDeTemps emploiDeTemps) {
        return emploiDeTempsRepository.save(emploiDeTemps);
    }

    public void deleteEmploideTemps(Long id) {
        emploiDeTempsRepository.deleteById(id);
    }
}

