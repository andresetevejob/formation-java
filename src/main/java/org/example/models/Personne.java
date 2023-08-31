package org.example.models;

public class Personne {
    private String numSecu;
    private String nom;
    private String prenoms;
    private String taille;
    private int age;
    private Adresse adresse;

    public String getNumSecu() {
        return numSecu;
    }

    public void setNumSecu(String numSecu) {
        this.numSecu = numSecu;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenoms() {
        return prenoms;
    }

    public void setPrenoms(String prenoms) {
        this.prenoms = prenoms;
    }

    public String getTaille() {
        return taille;
    }

    public void setTaille(String taille) {
        this.taille = taille;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setAdresse(Adresse adresse){
        this.adresse = adresse;
    }
    public Adresse getAdresse(){
        return this.adresse;
    }
    public void parler(){
        System.out.println("Je m'appelle "+nom+" "+prenoms);
    }
}
