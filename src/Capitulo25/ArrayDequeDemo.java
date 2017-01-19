package Capitulo25;

// Demonstra ArrayDeque.
// Primeiro usa a deque como uma pilha.
// Em seguida, usa-a como uma fila FIFO.

import java.util.*;

class ArrayDequeDemo {
    public static void main(String[] args) {

        // Cria uma deque de array.
        ArrayDeque<Character> adq = new ArrayDeque<Character>();

        System.out.println("Using adq as a stack.");

        // Usa adq como uma pilha.
        System.out.print("Pushing: ");

        // insere itens na pilha
        for(char ch = 'A'; ch <= 'Z'; ch++) {
            adq.push(ch);
            System.out.print(ch);
        }
        System.out.println();

        // agora, os extrai
        System.out.print("Popping: ");
        while(adq.peek() != null)
            System.out.print(adq.pop());

        System.out.println("\n");

        System.out.println("Using adq as a FIFO queue.");

        // Usa adq como uma fila FIFO.
        System.out.print("Queueing: ");
        for(char ch = 'A'; ch <= 'Z'; ch++) {
            adq.offerLast(ch);
            System.out.print(ch);
        }
        System.out.println();

        // agora, remove-os
        System.out.print("Removing: ");
        while(adq.peek() != null)
            System.out.print(adq.pollFirst());
    }
}
