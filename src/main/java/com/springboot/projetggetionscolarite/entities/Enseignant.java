package com.springboot.projetggetionscolarite.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Enseignant extends User {
    @OneToMany(mappedBy = "enseignant", cascade = CascadeType.ALL)
    private List<Classe> classes; // Classes assigned to Enseignant

    @OneToMany(mappedBy = "enseignant", cascade = CascadeType.ALL)
    private List<Matiere> matieres; // Subjects handled by Enseignant

    public List<Classe> getClasses() {
        return classes;
    }

    public void setClasses(List<Classe> classes) {
        this.classes = classes;
    }

    public List<Matiere> getMatieres() {
        return matieres;
    }

    public void setMatieres(List<Matiere> matieres) {
        this.matieres = matieres;
    }
}
