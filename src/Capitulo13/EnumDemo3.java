package Capitulo13;

//Usa um construtor, uma variável de instância e um método com a enumeração

enum Transport3 {
    CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22); //Observe os valores de inicialização

    private int speed; //velocidade típica de cada meio de transporte. Adiciona uma variável de instância

    //Construtor
    Transport3(int s) { speed = s; }    //Adiciona um construtor

    int getSpeed() { return speed; }    //Adiciona um método
}

class EnumDemo3 {
    public static void main(String[] args) {
        Transport3 tp;

        //Exibe a velocidade de um avião. Obtém a velocidade chamando getSpeed()
        System.out.println("Typical speed for an airplane is " + Transport3.AIRPLANE.getSpeed() + " miles per hour.\n");

        //Exibe todos os meios de transporte e velocidde
        System.out.println("All Transport speeds: ");
        for(Transport3 t : Transport3.values())
            System.out.println(t + " typical speed is " + t.getSpeed() + " miles per hour.");
    }
}

