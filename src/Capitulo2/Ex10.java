package Capitulo2;

//Escreva um programa que encontre todos os números primos entre 2 e 100

class Ex10 {

    public static void main(String[] args) {
        int i,j;
        boolean primo;

        for(i=2; i<100; i++){
            primo = true;

            for(j=2; j<=i/j; j++)
                if((i%j) == 0) primo = false;

                if(primo) System.out.println(i + " é primo");
        }
    }
}
