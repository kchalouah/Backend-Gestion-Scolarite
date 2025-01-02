package com.springboot.projetggetionscolarite.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Parent extends User {
    @OneToMany
    @JoinColumn(name = "parent_id")
    private List<Etudiant> enfants; // Children linked to Parent

    public List<Etudiant> getEnfants() {
        return enfants;
    }

    public void setEnfants(List<Etudiant> enfants) {
        this.enfants = enfants;
    }

}
