package Capitulo4;

class Vehicle {

    int passengers; //Nº de passageiros
    int fuelCap;    //Capacidade de armazenamento de combustível em galões
    int mpg;        //Consumo de combustível em milhas por galão
}

class VehicleDemo{  //Esta classe declara um objeto de tipo Veículo

    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        int range;

        //Atribui valores a campos de minivan
        minivan.passengers = 7;
        minivan.fuelCap = 16;
        minivan.mpg = 21;

        //Calcula a autonomia presumindo um tanque cheio de gasolina
        range = minivan.fuelCap * minivan.mpg;
        System.out.println("Minivan can carry " + minivan.passengers + " with a range of  " + range);

    }
}
