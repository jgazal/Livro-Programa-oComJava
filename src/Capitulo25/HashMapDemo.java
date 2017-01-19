package Capitulo25;

import java.util.*;

class HashMapDemo {
    public static void main(String[] args) {

        // Cria um mapa hash.
        HashMap<String, Double> hm = new HashMap<String, Double>();

        // Insere elementos no mapa.
        // Usa put( ) para inserir entradas.
        hm.put("John Doe", 3434.34);
        hm.put("Tom Smith", 123.22);
        hm.put("Jane Baker", 1378.00);
        hm.put("Todd Hall", 99.22);
        hm.put("Ralph Smith", -19.08);

        // Obtém um conjunto das entradas.
        Set<Map.Entry<String, Double>> set = hm.entrySet(); //Obtém uma visão de conjunto das entradas

        // Exibe o conjunto.
        for(Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");   //Exibe as chaves.
            System.out.println(me.getValue());      //e os valores
        }
        System.out.println();

        // Deposita 1000 na conta de John Doe.
        double balance = hm.get("John Doe");
        hm.put("John Doe", balance + 1000);

        System.out.println("John Doe's new balance: " +
                hm.get("John Doe"));
    }
}

