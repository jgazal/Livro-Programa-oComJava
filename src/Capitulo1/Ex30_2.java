package Capitulo1;

public class Ex30_2 {

    public static void main(String[] args) {
        int i,j;
        j = 0;

        for (i = 1; i <= 20; i++) {
            j = j + (i*i);
            //j += (i*i); //Mais uma forma, vista no capítulo 2

            if(i == 20)System.out.println("A soma dos 20 primeiros números n² é: " + j);
        }
    }
}
