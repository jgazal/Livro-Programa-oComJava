package Capitulo25;

// Demonstra HashSet.

import java.util.*;

class HashSetDemo {
    public static void main(String[] args) {

        // Cria um conjunto hash.
        HashSet<Character> hs = new HashSet<Character>();

        // Adiciona elementos ao conjunto hash.
        hs.add('A');
        hs.add('B');
        hs.add('C');
        hs.add('D');
        System.out.println("Original contents: " + hs);

        // Adiciona mais elementos.
        hs.add('E');
        hs.add('F');
        hs.add('G');
        hs.add('H');
        System.out.println("\nContents after additions: " + hs);

        // Exclui E e H.
        hs.remove('E');
        hs.remove('H');
        System.out.println("\nContents after deleting E and H: " + hs);

        // Adiciona E novamente.
        hs.add('E');
        System.out.println("\nContents after adding E: " + hs);

        // Adiciona uma coleção de elementos ao conjunto hash.
        ArrayList<Character> al = new ArrayList<Character>();
        al.add('X');
        al.add('Y');
        al.add('Z');
        hs.addAll(al);

        System.out.println("\nContents after adding collection: " + hs);
    }
}
