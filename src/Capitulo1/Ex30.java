package Capitulo1;

//Escreva um programa que exiba a soma dos 20 primeiros números elevados ao quadrados

class Ex30 {

    public static void main(String[] args) {
        int i,j,k;
        k = 0;

        for (i = 1; i <= 20; i++) {
            j = i * i;
            k = k + j;

            if(i == 20)System.out.println("A soma dos 20 primeiros números n² é: " + k);
        }
    }
}
