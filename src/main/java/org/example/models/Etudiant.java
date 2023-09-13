package org.example.models;

public class Etudiant {
    private String sexe;
    private String nom;
    private String prenom;
    private int age;
    private String taille;
    private String classe;
    private Ecole ecole;
    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTaille() {
        return taille;
    }

    public void setTaille(String taille) {
        this.taille = taille;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public Ecole getEcole() {
        return ecole;
    }

    public void setEcole(Ecole ecole) {
        this.ecole = ecole;
    }

    public void sePresenter() {
        System.out.println("Bonjour je m'appel" + nom + ' ' + prenom + " j'ai " + age +
                " et j'étudie le developpement d'application chez " + ecole.getNom());
    }
}
