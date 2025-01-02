package com.springboot.projetggetionscolarite.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class EmploiDeTemps {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String jour; // Day of the week (e.g., "Lundi")
    private String heure; // Time (e.g., "10:00 AM")

    @ManyToOne
    @JoinColumn(name = "matiere_id")
    private Matiere matiere; // Subject being taught during this time slot

    @ManyToOne
    @JoinColumn(name = "classe_id")
    private Classe classe; // Class assigned to this timetable

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJour() {
        return jour;
    }

    public void setJour(String jour) {
        this.jour = jour;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public Matiere getMatiere() {
        return matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }
}
