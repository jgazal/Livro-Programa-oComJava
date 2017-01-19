package Capitulo4;

//Adiciona um construtor

class Vehicle6 {

    int passengers; //Nº de passageiros
    int fuelCap;    //Capacidade de armazenamento de combustível em galões
    int mpg;        //Consumo de combustível em milhas por galão

    //Este é um construtor para Vehicle6
    Vehicle6(int p, int f, int m){
        passengers = p;
        fuelCap = f;
        mpg = m;
    }
    //Retorna a autonomia
    int range(){
        return fuelCap * mpg;
    }
    //Calcula o combustível necessário para cobrir uma determinada distância
    double fuelNeeded(int miles){
        return (double) miles/mpg;
    }
}
class VehConsDemo{

    public static void main(String[] args) {
        //Constrói veículos completos
        Vehicle6 minivan = new Vehicle6(7,16,21);
        Vehicle6 sportscar = new Vehicle6(2,14,12);

        double gallons;
        int dist = 252;

        gallons = minivan.fuelNeeded(dist);
        System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel");

        gallons = sportscar.fuelNeeded(dist);
        System.out.println("To go " + dist + " miles sportscar needs " + gallons + " gallons of fuel");
    }
}
