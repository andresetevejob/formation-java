package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class Ecole {

    private String nom;
    private String superficie;
    private int nbrClasses;
    private int nbrProfesseurs;
    private int numRue;
    private String nomRue;
    private int codePostal;
    private String ville;

    private List<Etudiant> etudiants;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }

    public int getNbrClasses() {
        return nbrClasses;
    }

    public void setNbrClasses(int nbrClasses) {
        this.nbrClasses = nbrClasses;
    }

    public int getNbrProfesseurs() {
        return nbrProfesseurs;
    }

    public void setNbrProfesseurs(int nbrProfesseurs) {
        this.nbrProfesseurs = nbrProfesseurs;
    }

    public int getNumRue() {
        return numRue;
    }

    public void setNumRue(int numRue) {
        this.numRue = numRue;
    }

    public String getNomRue() {
        return nomRue;
    }

    public void setNomRue(String nomRue) {
        this.nomRue = nomRue;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void addEtudiant(Etudiant etudiant){
        if(this.etudiants==null){
           this.etudiants = new ArrayList<>();
        }
        this.etudiants.add(etudiant);
        etudiant.setEcole(this);
    }
    public void showEtudiants(){
        for(Etudiant etudiant: etudiants){
            etudiant.sePresenter();
        }
    }
}
