package Capitulo4;

class Vehicle2 {

    int passengers; //Nº de passageiros
    int fuelCap;    //Capacidade de armazenamento de combustível em galões
    int mpg;        //Consumo de combustível em milhas por galão
}

class TwoVehicles{  //Esta clase declara dois objetos de tipo Veículo

    public static void main(String[] args) {
        Vehicle2 minivan = new Vehicle2();
        Vehicle2 sportscar = new Vehicle2();

        int range1, range2;

        //Atribui valores a campos de minivan
        minivan.passengers = 7;
        minivan.fuelCap = 16;
        minivan.mpg = 21;

        //Atribui valores a campos de sportscar
        sportscar.passengers = 2;
        sportscar.fuelCap = 14;
        sportscar.mpg = 12;

        //Calcula a autonomia presumindo um tanque cheio de gasolina
        range1 = minivan.fuelCap * minivan.mpg;
        range2 = sportscar.fuelCap * sportscar.mpg;

        System.out.println("Minivan can carry " + minivan.passengers + " with a range of  " + range1);
        System.out.println("Sportscar can carry " + sportscar.passengers + " with a range of  " + range2);
    }

}
