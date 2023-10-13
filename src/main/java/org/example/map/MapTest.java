package org.example.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {
    private static Map<String, List<String>> products = new HashMap<>();
    private static Map<Identifiant, String> Habitants = new HashMap<>();
    private static Map<Identifiant, Personne> Hbts = new HashMap<>();
    static {
        products.put("Ordinateurs",List.of("Apple","PC"));
        products.put("Livres",List.of("Vingt Mille Lieux sous les mers"));
    }
    public static void main(String[] args){
        //products.put("Voitures",List.of("BMW"));
        //List<String> ordinateurs = products.get("Ordinateurs");
        /**for(String v: ordinateurs){
            System.out.println(v);
        }**/
        /**if(products.containsKey("Livres")){
            System.out.println("Oui");
        }else{
            System.out.println("Non");
        }**/
        Habitants.put(new Identifiant("009938PMLOOI"),"Thomas");
        Hbts.put(new Identifiant("009938PMLOOI"),new Personne("Thomas"));
        if(Habitants.containsKey(new Identifiant("009938PMLOOI"))){
            System.out.println("Oui");
        }else{
            System.out.println("Non");
        }
        if(Hbts.containsValue(new Personne("Thomas"))){
            System.out.println("Oui je contiens Thomas");
        }
    }
}
