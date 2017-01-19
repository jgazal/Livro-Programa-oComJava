package Capitulo1;

class Ex14_PolParaMetrosTab {

    public static void main(String[] args) {
        double polegadas, metros;
        int contador;

        contador = 0;

        for(polegadas = 1; polegadas <= 144; polegadas++){
            metros = polegadas/39.37;   //converte polegadas para metros
            System.out.println(polegadas + " polegadas são " + metros + " metros");

            contador++;
            if(contador == 12){ //A cada 12 linhas, exibe uma linha em branco
                System.out.println();
                contador = 0;   //zera o contador de linhas
            }
        }
    }
}
