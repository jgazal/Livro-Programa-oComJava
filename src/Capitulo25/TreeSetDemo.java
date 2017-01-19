package Capitulo25;

// Um TreeSet cria uma árvore classificada.

import java.util.*;

class TreeSetDemo {
    public static void main(String[] args) {
        char[] chrs = { 'V', 'J', 'L', 'E', 'T', 'Q', 'C', 'P' };

        // Cria um conjunto de árvore e um conjunto hash.
        TreeSet<Character> ts = new TreeSet<Character>();
        HashSet<Character> hs = new HashSet<Character>();
        System.out.print("Contents of chrs: ");

        for(char ch : chrs)
            System.out.print(ch + " ");

        System.out.println();

        // Primeiro, adiciona os caracteres ao conjunto hash.
        for(char ch : chrs)
            hs.add(ch);

        System.out.println("Contents of hash set: " + hs);

        // Em seguida, adiciona os caracteres ao conjunto de árvore.
        for(char ch : chrs)
            ts.add(ch);

        System.out.println("Contents of tree set: " + ts);
    }
}
