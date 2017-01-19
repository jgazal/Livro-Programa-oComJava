package Capitulo25;

// Demonstra vários algoritmos.

import java.util.*;

class AlgorithmsDemo {
    public static void main(String[] args) {

        // Cria uma lista encadeada.
        LinkedList<Character> ll = new LinkedList<Character>();

        // Insere itens na lista.
        for(int i = 0; i < 26; i+=2) {
            ll.add((char) ('A' + i));
            ll.add((char) ('Z' - i));
        }

        // Exibe a lista original.
        System.out.print("Original list: ");
        for(char ch : ll)
            System.out.print(ch);

        System.out.println();

        // Classifica a lista.
        Collections.sort(ll);   //Classifica a lista.
        System.out.print("List sorted: ");
        for(char ch : ll)
            System.out.print(ch);

        System.out.println("\n");

        // Pesquisa a lista.
        System.out.println("Using binarySearch() to find X.");
        int i = Collections.binarySearch(ll, 'X');  //Pesquisa a lista.
        if(i >= 0)
            System.out.println("X found. Index is " + i);

        System.out.println();

        // Inverte a lista.
        Collections.reverse(ll);    //Inverte a lista.
        System.out.print("List reversed: ");
        for(char ch : ll)
            System.out.print(ch);

        System.out.println("\n");

        // Gira a lista.
        Collections.rotate(ll, 5);  //Gira a lista.
        System.out.print("List rotated: ");
        for(char ch : ll)
            System.out.print(ch);

        System.out.println("\n");

        // Cria uma nova lista.
        ll = new LinkedList<Character>();

        // Adiciona um string a ela.
        String str = "this is a test";

        for(char ch : str.toCharArray())
            ll.add(ch);
        System.out.print("Here is the new list: ");

        for(char ch : ll)
            System.out.print(ch);

        System.out.println();

        // Substitui todos os t por *
        Collections.replaceAll(ll, 't', '*');
        System.out.print("After replacements: ");

        for(char ch : ll)
            System.out.print(ch);
    }
}
