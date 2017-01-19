package Capitulo25;

// LinkedHashSet comparada com HashSet e TreeSet.

import java.util.*;

class SetsDemo {
    public static void main(String[] args) {
        char[] chrs = { 'V', 'J', 'L', 'E', 'T', 'Q', 'C', 'P' };

        // Cria todos os três conjuntos.
        TreeSet<Character> ts = new TreeSet<Character>();
        HashSet<Character> hs = new HashSet<Character>();
        LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();

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

        // Para concluir, adiciona os caracteres ao conjunto hash encadeado.
        for(char ch : chrs)
            lhs.add(ch);

        System.out.println("Contents of linked hash set: " + lhs);
    }
}