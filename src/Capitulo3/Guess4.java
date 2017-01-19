package Capitulo3;

class Guess4 {

    public static void main(String[] args) throws java.io.IOException {
        char ch, ignore, answer = 'K';

        do {
            System.out.println("Estou pensando em uma letra entre A e Z");
            System.out.print("Você consegue adivinhar? ");

            ch = (char) System.in.read();

            do {    //descarta qualquer outro caractere do buffer de entrada
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (ch == answer) System.out.println("**Correto**");
            else {
                System.out.print("--Errado--");
                if (ch < answer) System.out.println("muito baixo");
                else System.out.println("muito alto");
                System.out.println("Tente novamente!\n");
            }
        }while (answer != ch) ;
    }
}
