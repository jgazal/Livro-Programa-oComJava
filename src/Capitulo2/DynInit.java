package Capitulo2;

class DynInit {

    public static void main(String[] args) {
        double radius = 4, height = 5;

        double volume = 3.1416 * radius * radius * height;  //volume e inicializado dinamicamente no tempo de execução
                                                            //volume do cilindro = pi * r² * h
        System.out.println("O volume é " + volume);
    }
}
