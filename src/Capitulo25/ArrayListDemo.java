package Capitulo25;

// Demonstra ArrayList.

import java.util.*;

class ArrayListDemo {
    public static void main(String[] args) {

        // Cria uma lista de array.
        ArrayList<Character> al = new ArrayList<Character>(); //Constrói um ArrayList para caracteres

        System.out.println("Initial size: " + al.size());

        // Adiciona elementos ao fim da lista, um de cada vez.
        al.add('A');
        al.add('B');
        al.add('C');
        al.add('D');
        al.add('E');
        System.out.println("\nSize after additions: " + al.size());

        // Exibe a lista de array usando a representação de toString().
        System.out.println("Contents: " + al);

        // Agora, adiciona elementos ao meio da lista. Isso fará o array se expandir.
        for(int i = 0; i < 3; i++)
            al.add(2, (char) ('x' + i));

        System.out.println("\nSize after additions: " + al.size());
        System.out.println("Contents: " + al);

        // Exclui os elementos recém-adicionados. Isso fará o array se contrair.
        for(int i = 0; i < 3; i++)
            al.remove(2);   //Remove um elemento.

        System.out.println("\nSize after deletions: " + al.size());
        System.out.println("Contents: " + al);

        // Usa set() para definir o valor de um índice.
        for(int i=0; i < al.size(); i++)
            al.set(i, Character.toLowerCase(al.get(i)));    //Altera um elemento.

        System.out.println("\nAfter changing to lowercase.");
        System.out.println("Contents: " + al);

        // Encontra e remove um valor
        int idx = al.indexOf('d');  //Encontra o índice de um valor.
        if(idx >= 0) al.remove(idx);

        System.out.println("\nAfter finding and removing d.");
        System.out.println("Contents: " + al);

        // Esvazia a lista.
        al.clear(); //Remove todos os elementos da lista.
        System.out.println("\nAfter clearing the list.");
        System.out.println("Contents: " + al);

        // Adiciona os dígitos de 0 a 9
        for(int i=0; i < 10; i++)
            al.add((char) ('0' + i));

        // Exibe elementos alternados.
        System.out.print("\nHere is every other digit: ");
        for(int i=0; i < al.size(); i+=2)
            System.out.print(al.get(i) + " ");
    }
}
