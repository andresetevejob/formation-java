package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class Commande {

    private int numero;

    private List<LigneCommande> ligneCommandes;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<LigneCommande> getLigneCommandes() {
        return ligneCommandes;
    }

    public void setLigneCommandes(List<LigneCommande> ligneCommandes) {
        this.ligneCommandes = ligneCommandes;
    }

    public void addLignesCommandes(LigneCommande ligneCommande){
        if(ligneCommandes == null) {
            this.ligneCommandes = new ArrayList<>();
        }
        this.ligneCommandes.add(ligneCommande);
        ligneCommande.setCommande(this);
    }
}
