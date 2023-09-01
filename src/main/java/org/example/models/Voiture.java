package org.example.models;

public class Voiture {

    private String modele;

    private String couleur;

    private Moteur moteur;

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public Moteur getMoteur() {
        return moteur;
    }

    public void setMoteur(Moteur moteur) {
        this.moteur = moteur;
    }

    public void demarrer() {
        System.out.println("Vroom le moteur " + moteur );
    }
}
