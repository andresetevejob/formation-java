package org.example.models;

public class Produit {

    private String categorie;
    private String nom;
    private String description;
    private int prix;
    private Categories categories;

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

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

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public void afficherProduit() {
        System.out.println("Le produit " + nom +
                " à un montant de " + prix + " et fais partie de la categorie " + categories.getNom());
    }

}
