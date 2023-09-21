package org.example.models;

public class Facture {

    private int numero;
    private int montant;
    private Client client;
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void afficherFacture() {
        System.out.println("La facture n° " + numero + " à un montant de " + montant );
    }
}
