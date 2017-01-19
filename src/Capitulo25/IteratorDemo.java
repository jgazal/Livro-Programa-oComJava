package Capitulo25;

// Demonstra tanto Iterator quanto ListIterator.

import java.util.*;

class IteratorDemo {
    public static void main(String[] args) {

        // Cria uma lista de strings.
        ArrayList<String> al = new ArrayList<String>();

        // Adiciona entradas à lista de array.
        al.add("Alpha");
        al.add("Beta");
        al.add("Gamma");
        al.add("Delta");
        al.add("Epsilon");
        al.add("Zeta");
        al.add("Eta");

        // Primeiro, usa Iterator.
        // Usa Iterator para exibir o conteúdo da lista.
        System.out.print("Original contents: ");
        Iterator<String> itr = al.iterator();   //Obtém um iterador.

        while(itr.hasNext())    //Procura um próximo elemento.
            System.out.print(itr.next() + " "); //Obtém o próximo elemento
        System.out.println();

        // Usa Iterator para remover Gamma da lista.
        itr = al.iterator();

        while(itr.hasNext()) {
            if(itr.next().equals("Gamma"))
                itr.remove();   //Usa um iterador para remover um elemento.
        }
        System.out.print("Contents after deletion: ");
        itr = al.iterator();

        while(itr.hasNext())
            System.out.print(itr.next() + " ");
        System.out.println();

        // Agora, usa ListIterator.
        // Usa ListIterator para adicionar Gamma novamente à lista.
        ListIterator<String> litr = al.listIterator();  //Obtém um iterador de lista.

        while(litr.hasNext()) {
            if(litr.next().equals("Beta"))
                litr.add("Gamma");  //Adiciona um elemento usando o iterador de lista.
        }
        System.out.print("Contents after addition: ");
        litr = al.listIterator();

        while(litr.hasNext())
            System.out.print(litr.next() + " ");
        System.out.println();

        // Usa ListIterator para modificar os objetos que estão sendo percorridos.
        String str;
        litr = al.listIterator();

        while(litr.hasNext()) {
            str = litr.next();
            if(str.equals("Eta"))
                litr.set("Omega");  //Usa um iterador de lista para alterar um elemento
            else if(str.equals("Zeta"))
                litr.set("Psi");
            else if(str.equals("Epsilon"))
                litr.set("Chi");
            else if(str.equals("Delta"))
                litr.set("...");
        }
        System.out.print("Contents after changes: ");
        litr = al.listIterator();

        while(litr.hasNext())
            System.out.print(litr.next() + " ");
        System.out.println();

        // Usa ListIterator para exibir a lista de trás para frente.
        System.out.print("Modified list backwards: ");

        while(litr.hasPrevious()) {
            System.out.print(litr.previous() + " ");    //Exibe a lista na ordem inversa.
        }
        System.out.println();
    }
}
