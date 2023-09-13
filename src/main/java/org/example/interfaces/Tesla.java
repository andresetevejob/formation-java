package org.example.interfaces;

import org.example.interfaces.Automobile;

public class Tesla implements Automobile {
    @Override
    public void rouler() {
        System.out.println("je roule à 20km/h");
    }

    @Override
    public void arreter() {
       System.out.println("je fais des prouts lorsque je m'arrête");
    }

    @Override
    public void emettrePositionGps() {
       System.out.println("emisssion coordonnées gps tesla");
    }
}
