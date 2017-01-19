package Capitulo25;

// Demonstra LinkedList.

import java.util.*;

class LinkedListDemo {
    public static void main(String[] args) {

        // Cria uma lista encadeada.
        LinkedList<Character> ll = new LinkedList<Character>();

        // Adiciona elementos à lista encadeada.
        ll.add('B');
        ll.add('E');
        ll.add('F');

        System.out.println("Original contents: " + ll);

        // Demonstra addLast() e addFirst().
        ll.addLast('G');    //Adiciona elementos ao fim e
        ll.addFirst('A');   //ao início da lista.

        System.out.println("\nAfter calls to addFirst() and addLast().");
        System.out.println("Contents: " + ll);

        // Adiciona elementos em um índice.
        ll.add(2, 'D'); //Adiciona elementos
        ll.add(2, 'C'); //em um índice específico.

        System.out.println("\nAfter insertions.");
        System.out.println("Contents: " + ll);

        // Exibe o primeiro e o último elementos.

        System.out.println("\nHere are the first and last elements: " +
                ll.getFirst() + " " + ll.getLast());    //Obtém os elementos do início e do fim da lista.

        // Cria uma visão de sublista.
        List<Character> sub = ll.subList(2, 5); //Obtém a visão de uma sublista.

        System.out.println("\nContents of sublist visão: " + sub);

        // Cria uma nova lista contendo a sublista
        LinkedList<Character> ll2 = new LinkedList<Character>(sub);

        // Remove de ll os elementos de ll2.
        ll.removeAll(ll2);

        System.out.println("\nAfter removing ll2 from ll.");
        System.out.println("Contents: " + ll);

        // Remove o primeiro e o último elementos.
        ll.removeFirst();
        ll.removeLast();

        System.out.println("\nAfter deleting first and last element: ");
        System.out.println("Contents: " + ll);

        // Obtém e define um valor usando um índice.
        ll.set(0, Character.toLowerCase(ll.get(0)));    //Altera um valor.

        System.out.println("\nAfter change: " + ll);
    }
}
