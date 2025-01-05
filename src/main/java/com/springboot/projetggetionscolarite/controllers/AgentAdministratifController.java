package com.springboot.projetggetionscolarite.controllers;

import com.springboot.projetggetionscolarite.entities.AgentAdministratif;
import com.springboot.projetggetionscolarite.services.AgentAdministratifService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/agents-administratifs")
public class AgentAdministratifController {

    private final AgentAdministratifService agentAdministratifService;

    @Autowired
    public AgentAdministratifController(AgentAdministratifService agentAdministratifService) {
        this.agentAdministratifService = agentAdministratifService;
    }

    // Get all AgentAdministratifs
    @GetMapping
    public ResponseEntity<List<AgentAdministratif>> getAllAgentAdministratifs() {
        List<AgentAdministratif> agents = agentAdministratifService.getAllAgentAdministratifs();
        return new ResponseEntity<>(agents, HttpStatus.OK);
    }

    // Get AgentAdministratif by ID
    @GetMapping("/{id}")
    public ResponseEntity<AgentAdministratif> getAgentAdministratifById(@PathVariable Long id) {
        Optional<AgentAdministratif> agent = agentAdministratifService.getAgentAdministratifById(id);
        return agent.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Create or Update an AgentAdministratif
    @PostMapping
    public ResponseEntity<AgentAdministratif> createOrUpdateAgentAdministratif(@RequestBody AgentAdministratif agentAdministratif) {
        AgentAdministratif savedAgent = agentAdministratifService.saveAgentAdministratif(agentAdministratif);
        return new ResponseEntity<>(savedAgent, HttpStatus.CREATED);
    }

    // Delete an AgentAdministratif
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAgentAdministratif(@PathVariable Long id) {
        agentAdministratifService.deleteAgentAdministratif(id);
        return ResponseEntity.noContent().build();
    }
}
