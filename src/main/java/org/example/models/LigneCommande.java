package org.example.models;

public class LigneCommande {

    private Produit produit;
    private int quantite;
    private int prixTotal;

    private Commande commande;

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public int getPrixTotal() {
        return prixTotal;
    }

    public void calculerPrixTotal(){
        this.prixTotal = this.produit.getPrix()*quantite;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }
}
