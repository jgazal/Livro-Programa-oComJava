package Capitulo25;

import java.util.*;

class TreeMapDemo {
    public static void main(String[] args) {

        // Cria um mapa de árvore.
        TreeMap<String, Double> tm = new TreeMap<String, Double>();

        // Insere elementos no mapa.
        tm.put("John Doe", 3434.34);
        tm.put("Tom Smith", 123.22);
        tm.put("Jane Baker", 1378.00);
        tm.put("Todd Hall", 99.22);
        tm.put("Ralph Smith", -19.08);

        // Obtém um conjunto das entradas.
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        // Exibe os elementos.
        for(Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        // Deposita 1000 na conta de John Doe.
        double balance = tm.get("John Doe");
        tm.put("John Doe", balance + 1000);

        System.out.println("John Doe’s new balance: " +
                tm.get("John Doe"));
    }
}
