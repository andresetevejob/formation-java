package org.example;
import org.example.models.Client;
import org.example.models.Facture;
import org.example.models.Produit;
import org.example.models.Categories;

public class Ecommerce {
    public static void main (String[] args) {
        Client client1 = new Client();
        client1.setNom("Valjean");
        client1.setPrenom("Jean");
        client1.setAdresse("Cours JDG");

        Facture facture1 = new Facture();
        facture1.setNumero(15462);
        facture1.setMontant(90);

        client1.addFacture(facture1);
        client1.showFactures();


        Produit produit1 = new Produit();
        produit1.setNom("basket");
        produit1.setCategorie("running");
        produit1.setDescription("Confort et performance");
        produit1.setPrix(60);

        Categories categories1 = new Categories();
        categories1.setNom("Chaussure");
        categories1.setType("Running");

        categories1.addProduit(produit1);
        categories1.showProduits();
    }
}
