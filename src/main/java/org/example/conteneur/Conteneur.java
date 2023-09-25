package org.example.conteneur;

import java.util.ArrayList;
import java.util.List;

public class Conteneur {

    public static void main(String[] args){
        List<String> words = new ArrayList<>();
        words.add("word 1");
        words.add("word 2");
        words.add("word 3");
        words.add("word 4");
        words.add("word 5");
        words.add("word 6");
        words.add("word 7");
        words.add("word 8");
        words.add("word 9");
        words.add("word 10");
        words.add("word 11");
        words.add("mon elements");
        System.out.println(words.size());
        words.remove("mon elements");
        //recuperer le premier element
        if(12<words.size()){
            System.out.println(words.get(11));
        }
        else{
            System.out.println("Je possède moins d'éléments que prévu");
        }
    }
}
