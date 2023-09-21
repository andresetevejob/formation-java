package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private String nom;
    private String prenom;
    private String adresse;
    private List<Facture> factures;
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public List<Facture> getFactures() {
        return factures;
    }
    public void setFactures(List<Facture> factures) {
        this.factures = factures;
    }

    public void addFacture(Facture facture) {
        if(this.factures == null){
            this.factures = new ArrayList<>();
        }
        this.factures.add(facture);
        facture.setClient(this);
    }

    public void showFactures(){
        for(Facture facture: factures){
            facture.afficherFacture();
        }
    }
}
