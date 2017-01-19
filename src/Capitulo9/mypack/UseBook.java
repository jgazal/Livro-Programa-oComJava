//Esta classe está no pacote mypack
package Capitulo9.mypack;

import Capitulo9.bookpack.*;    //Importa bookpack

//Usa a classe Book a partir de bookpack
class UseBook {
    public static void main(String[] args) {
        Capitulo9.bookpack.Book[] books = new Capitulo9.bookpack.Book[5];   //Qualifica Book com o nome do seu pacote

        books[0] = new Capitulo9.bookpack.Book("The Art of Computer Programming, Vol 3", "Knuth", 1973);
        books[1] = new Capitulo9.bookpack.Book("Moby Dick", "Melville", 1851);
        books[2] = new Capitulo9.bookpack.Book("Thirteen at Dinner", "Christie", 1933);
        books[3] = new Capitulo9.bookpack.Book("Red Storm Rising", "Clancy", 1986);
        books[4] = new Capitulo9.bookpack.Book("On the Road", "Kerouac", 1955);

        for(int i=0; i < books.length; i++) {
            books[i].show();
            System.out.println();
        }
    }
}