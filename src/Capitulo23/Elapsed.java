package Capitulo23;

// Marcando o tempo de execução do programa.

class Elapsed {
    public static void main(String[] args) {
        long start, end;

        System.out.println("Timing a for loop from 0 to 100,000,000");

        // marca o tempo de um laço de 0 a 100.000.000
        start = System.currentTimeMillis(); // obtém a hora inicial

        for(long i=0; i < 100000000L; i++) ;
        end = System.currentTimeMillis(); // obtém a hora final

        System.out.println("Elapsed time: " + (end-start));
    }
}