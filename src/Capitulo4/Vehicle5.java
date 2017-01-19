package Capitulo4;

class Vehicle5 {

    int passengers; //Nº de passageiros
    int fuelCap;    //Capacidade de armazenamento de combustível em galões
    int mpg;        //Consumo de combustível em milhas por galão

    //Retorna a autonomia
    int range() {
        return fuelCap * mpg;
    }
    //Calcula o combustível necessário para cobrir uma determinada distância
    double fuelNeeded(int miles){
        return (double) miles/mpg;
    }
}
class CompFuel{

    public static void main(String[] args) {
        Vehicle5 minivan = new Vehicle5();
        Vehicle5 sportscar = new Vehicle5();
        double gallons;
        int dist = 252;

        //Atribui valores a campos de minivan
        minivan.passengers = 7;
        minivan.fuelCap = 16;
        minivan.mpg = 21;

        //Atribui valores a campos de sportscar
        sportscar.passengers = 2;
        sportscar.fuelCap = 14;
        sportscar.mpg = 12;

        gallons = minivan.fuelNeeded(dist);
        System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel");

        gallons = sportscar.fuelNeeded(dist);
        System.out.println("To go " + dist + " miles sportscar needs " + gallons + " gallons of fuel");
    }
}
