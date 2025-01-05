package com.springboot.projetggetionscolarite.services;

import com.springboot.projetggetionscolarite.entities.AgentAdministratif;
import com.springboot.projetggetionscolarite.repositories.AgentAdministratifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgentAdministratifService {

    private final AgentAdministratifRepository agentAdministratifRepository;

    @Autowired
    public AgentAdministratifService(AgentAdministratifRepository agentAdministratifRepository) {
        this.agentAdministratifRepository = agentAdministratifRepository;
    }

    // Create or Update an AgentAdministratif
    public AgentAdministratif saveAgentAdministratif(AgentAdministratif agentAdministratif) {
        return agentAdministratifRepository.save(agentAdministratif);
    }

    // Get all AgentAdministratifs
    public List<AgentAdministratif> getAllAgentAdministratifs() {
        return agentAdministratifRepository.findAll();
    }

    // Get an AgentAdministratif by ID
    public Optional<AgentAdministratif> getAgentAdministratifById(Long id) {
        return agentAdministratifRepository.findById(id);
    }

    // Delete an AgentAdministratif by ID
    public void deleteAgentAdministratif(Long id) {
        agentAdministratifRepository.deleteById(id);
    }
}
