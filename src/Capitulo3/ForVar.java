package Capitulo3;

public class ForVar {

    public static void main(String[] args) {
        int sum = 0;
        int product = 1;

        for(int i=1; i<=5; i++){
            sum += i;   //Resultado 15 (5+4+3+2+1)
            product *= i;   //Resultado 120 (5*4*3*2*1)
        }
        System.out.println("sum é " + sum);
        System.out.println("product é " + product);
    }
}
