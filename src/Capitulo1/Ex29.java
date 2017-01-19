package Capitulo1;

//Escreva um programa que exiba os 20 primeiros números elevados ao quadrados

class Ex29 {

    public static void main(String[] args) {
        int i;

        for(i = 1; i<=20; i++){
            System.out.print(i + "²");
            System.out.println(" = " + i*i);
        }
    }
}
