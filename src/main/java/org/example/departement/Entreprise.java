package org.example.departement;

import java.util.List;

public class Entreprise {

    public static void main (String[] args) {

        //Création de mes départements
        Departement departement1 = new Departement("RH");
        Departement departement2 = new Departement("Informatique");
        Departement departement3 = new Departement("Comptabilité");

        //Création de mes employés
        Employee employee1 = new Employee(1,"Jean", 26);
        Employee employee2 = new Employee(2,"Jeanne", 31);
        Employee employee3 = new Employee(3,"Benoit", 16);
        Employee employee4 = new Employee(4,"Thomas", 27);
        Employee employee5 = new Employee(5,"Alice", 45);
        Employee employee6 = new Employee(6,"Marie", 29);
        Employee employee7 = new Employee(6,"Stephanie", 37);



        // j'ajoute mes employés aux departements
        departement1.addEmployee(employee1);
        departement2.addEmployee(employee2);
        departement3.addEmployee(employee3);
        departement2.addEmployee(employee4);
        departement1.addEmployee(employee5);
        departement1.addEmployee(employee6);
        departement3.addEmployee(employee7);

        //J'affiche la liste des departement et de leurs employés

        System.out.println("Liste des départements et de leurs employés :");
        List<Departement> departments = List.of(departement1, departement2,departement3);
        for (Departement departement : departments) {
            System.out.println("Département : " + departement.getName());
            List<Employee> employees = departement.getEmployees();
            for (Employee employee : employees) {
                System.out.println("  Employé : " + employee.getName() + " (ID : " + employee.getId() + ")");
            }
        }
    }
}
