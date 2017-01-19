package Capitulo1;

//Média dos 20 primeiros quadrados

public class Ex31 {

    public static void main(String[] args) {
        int i,j,k;
        k = 0;

        for (i = 1; i <= 20; i++) {
            j = i * i;
            k = k + j;

            if(i == 20)System.out.println("A média dos 20 primeiros números ^2 é: " + k/20);
        }
    }
}
