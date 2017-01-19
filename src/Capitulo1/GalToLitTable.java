package Capitulo1;

class GalToLitTable {

    public static void main(String[] args) {
        double gallons,liters;
        int counter;

        counter = 0;

        for(gallons = 1; gallons <= 100; gallons++){
            liters = gallons * 3.7854;
            System.out.println(gallons + " galões são " + liters + " litros.");

            counter++;  //incrementa o contador de linhas a cada iteração do laço
            if(counter == 10){  //a cada 10 linhas, exibe uma linha em branco
                System.out.println();
                counter = 0;    //zera o contador de linhas
            }
        }
    }
}
