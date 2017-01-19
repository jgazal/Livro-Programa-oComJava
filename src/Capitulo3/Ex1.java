package Capitulo3;

/*Escreva um programa que leia caracteres do teclado até um ponto ser recebido.
Faça-o contar o número de espaços. Relate o total no fim do programa.*/

public class Ex1 {

    public static void main(String[] args) throws java.io.IOException{
        char ch;
        int espacos = 0;

        System.out.println(" ");

        do{
            ch = (char) System.in.read();

            if(ch == ' ') espacos++;
        }while (ch != '.');

        System.out.println("Espaços: " + espacos);

    }
}
