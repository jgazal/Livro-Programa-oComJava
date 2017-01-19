package Capitulo3;

class Guess {

    public static void main(String[] args) throws java.io.IOException{

        char ch, answer = 'K';

        System.out.println("Estou pensando em uma letra entre A e Z");
        System.out.print("Você consegue adivinhar? ");

        ch = (char) System.in.read();   //Lẽ um char do teclado

        if(ch == answer) System.out.println("**Correto**");

    }
}
