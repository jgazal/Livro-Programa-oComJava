package Capitulo3;

class Empty3 {

    public static void main(String[] args) {
        int i;
        int sum = 0;

        for(i=1; i<=5; sum += i++); //laço sem corpo

        System.out.println("sum é " + sum);

        //Resultado: 15 (5+4+3+2+1)
    }
}
