package org.example.departement;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Departement {

    private String name;
    private Set<Integer> employeeIds;
    private List<Employee> employees;


    public Departement(String name) {
        this.name = name;
        this.employeeIds = new HashSet<>();
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {
        // Vérification de la règle 2 : L'employé doit avoir au moins 18 ans
        if (employee.getAge() < 18) {
            System.out.println("Age minimum de l'employé = 18 ans");
            return; // Arrête l'ajout de l'employé s'il a moins de 18 ans
        }

        // Vérification de la règle 1 : Pas de doublons d'identifiant
        if (employeeIds.contains(employee.getId())) {
            System.out.println("Un employé avec le même identifiant existe déjà dans ce département.");
            return; // Arrête l'ajout de l'employé si l'identifiant existe déjà
        }

        // Si les deux règles sont respectées, on ajoute l'employé
        employees.add(employee);
        employeeIds.add(employee.getId());
    }


}

