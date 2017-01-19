package Capitulo2;

class SCops {

    public static void main(String[] args) {
        int n,d,q;

        n = 10;
        d = 2;
        if(d != 0 && (n%d) == 0) System.out.println(d + " é um fator de " + n);

        d = 0;  //configura d com zero

        if(d != 0 && (n%d) == 0) System.out.println(d + " é um fator de " + n);  //O operador de curto-circuito impede
                                                                                //uma divisão por zero
        //if(d != 0 & (n%d) == 0)System.out.println(d + "é um fator de " + n);   //As duas expressões são avaliadas,
                                                                                //permitindo que ocorra uma divisão por0
    }
}
