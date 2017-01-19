package Capitulo3;

//Escreva um programa que use um laço for para gerar e exibir a progressão 1,2,4,8,16,32,64

public class Ex9 {

    public static void main(String[] args) {

        for(int i=1; i<100; i+=i)
            System.out.print(i + " ");
    }
}
