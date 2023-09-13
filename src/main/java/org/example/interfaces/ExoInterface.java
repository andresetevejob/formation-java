package org.example.interfaces;

public class ExoInterface {
    public static void main(String[] args){
        Automobile renault = new Renault();
        Automobile tesla = new Tesla();
        descritAutomobile(renault);
        descritAutomobile(tesla);
    }
    public static void descritAutomobile(Automobile automobile){
            automobile.rouler();
            automobile.arreter();
            automobile.emettrePositionGps();
    }
}
