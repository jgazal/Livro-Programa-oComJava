package Capitulo25;

// Usa um comparador para classificar contas por sobrenome.

import java.util.*;

// Compara as últimas palavras inteiras de dois strings.
class NameComp implements Comparator<String> {  //Implementa um comparador.
    public int compare(String aStr, String bStr) {
        int i, j, k;

        // Encontra o índice do começo do sobrenome.
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        k = aStr.substring(i).compareTo(bStr.substring(j));
        if(k==0) // os sobrenomes coincidem, verifica o nome inteiro
            return aStr.compareTo(bStr);
        else
            return k;
    }
// Não é preciso sobrepor equals.
}

class TreeMapDemo2 {
    public static void main(String[] args) {

        // Cria um mapa de árvore que usa o comparador especificado.
        TreeMap<String, Double> tm = new TreeMap<String,
                Double>(new NameComp());    //Especifica um comparador ao construir um TreeMap.

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
