package org.example.inheritances;

public class ExoInheritance {
    public static void main(String[] args){
        Etudiant etudiant = new Etudiant();
        etudiant.setNom("PierreDuval");
        Employe employe = new Employe();
        employe.setSalaire(5000);
    }
}
