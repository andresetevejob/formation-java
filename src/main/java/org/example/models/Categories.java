package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class Categories {

    private String nom;
    private String type;
    private List<Produit> produits;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void addProduit(Produit produit){
        if(this.produits==null){
            this.produits = new ArrayList<>();
        }
        this.produits.add(produit);
        produit.setCategories(this);
    }

    public void showProduits(){
        for(Produit produit: produits){
            produit.afficherProduit();
        }
    }
}
