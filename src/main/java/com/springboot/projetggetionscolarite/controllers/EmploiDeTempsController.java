package com.springboot.projetggetionscolarite.controllers;
import com.springboot.projetggetionscolarite.entities.*;
import com.springboot.projetggetionscolarite.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/emplois")
public class EmploiDeTempsController {
    @Autowired
    private EmploiDeTempsService emploiDeTempsService;

    @GetMapping
    public List<EmploiDeTemps> getAllEmploiDeTemps() {
        return emploiDeTempsService.getAllEmploiDeTemps();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmploiDeTemps> getEmploiDeTempsById(@PathVariable Long id) {
        Optional<EmploiDeTemps> emploiDeTemps = emploiDeTempsService.getEmploiDeTempsById(id);
        return emploiDeTemps.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public EmploiDeTemps saveEmploiDeTemps(@RequestBody EmploiDeTemps emploiDeTemps) {
        return emploiDeTempsService.saveEmploiDeTemps(emploiDeTemps);
    }

    @DeleteMapping("/{id}")
    public void deleteEmploiDeTemps(@PathVariable Long id) {
        emploiDeTempsService.deleteEmploideTemps(id);
    }
}