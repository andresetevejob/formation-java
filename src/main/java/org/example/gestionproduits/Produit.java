package org.example.gestionproduits;

import java.io.PrintStream;

public class Produit {
    private String nom;
    private String description;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void descritToi() {
        System.out.println(nom+" "+description);
    }
}
