//Demonstração breve dos pacotes
package Capitulo9.bookpack; //Este arquivo faz parte do pacote bookpack

public class Book {     //Logo, Book faz parte de Capitulo9
    //Book e seus métodos devem ser public para serem usados por outros pacotes
    private String title;
    private String author;
    private int pubDate;

    public Book(String t, String a, int d){
        title = t;
        author = a;
        pubDate = d;
    }
    public void show(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
    }
}
class BookDemo{ //BookDemo também faz parte de Capitulo9
    public static void main(String[] args) {
        Book[] books = new Book[5];

        books[0] = new Book("The Art of Computer Programming, Vol 3", "Knuth", 1973);
        books[1] = new Book("Moby Dick", "Melville", 1851);
        books[2] = new Book("Thirteen at Dinner", "Christie", 1933);
        books[3] = new Book("Red Storm Rising", "Clancy", 1986);
        books[4] = new Book("On the Road", "Kerouac", 1955);

        for(int i=0; i<books.length; i++){
            books[i].show();
            System.out.println();
        }
    }
}

