package org.example.interfaces;

import org.example.interfaces.Automobile;

public class Renault implements Automobile {
    @Override
    public void rouler() {
        System.out.println("je roule à 5km/h");
    }

    @Override
    public void arreter() {
        System.out.println("je m'arrête correctement");
    }

    @Override
    public void emettrePositionGps() {
        System.out.println("emisssion coordonnées gps Renault");
    }
}
