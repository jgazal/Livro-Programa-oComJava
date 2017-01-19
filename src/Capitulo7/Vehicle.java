package Capitulo7;

//Constrói uma subclasse de Vehicle para caminhões

class Vehicle {
    private int passengers; //número de passageiros
    private int fuelCap;    //capacidade de armazenamento de combustível em galões
    private int mpg;        //consumo de combustível em milhas por galão

    //Construtor para Vehicle
    Vehicle(int p, int f, int m){
        passengers = p;
        fuelCap = f;
        mpg = m;
    }
    //Retorna a autonomia
    int range(){
        return mpg*fuelCap;
    }
    //Calcula o combustível necessário para cobrir uma determinada distância
    double fuelNeeded(int miles){
        return (double) miles/mpg;
    }
    //Métodos de acesso de variáveis de instância
    int getPassengers(){return passengers;}
    void setPassengers(int p){passengers = p;}

    int getFuelCap(){return fuelCap;}
    void setFuelCap(int f){fuelCap = f;}

    int getMpg(){return mpg;}
    void setMpg(int m){mpg = m;}
}
//Estende Vehicle para criar a especialização Truck
class Truck extends Vehicle{
    private int cargoCap;   //capacidade de carga em libras

    //Construtor para Truck
    Truck(int p, int f, int m, int c){
        super(p, f, m); //Inicializa membros de Vechicle usando o construtor de Vehicle

        cargoCap = c;
    }
    //Métodos acessadores para cargoCap
    int getCargo(){return cargoCap;}
    void putCargo(int c){cargoCap = c;}
}
class TruckDemo{
    public static void main(String[] args) {
        //Constrói alguns caminhões
        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);
        double gallons;
        int dist = 252;

        gallons = semi.fuelNeeded(dist);
        System.out.println("Semi can carry " + semi.getCargo() + " pounds");
        System.out.println("to go " + dist + " miles semi needs " + gallons + " gallons of fuel\n");

        gallons = pickup.fuelNeeded(dist);
        System.out.println("Pickup can carry " + pickup.getCargo() + " pounds");
        System.out.println("to go " + dist + " miles semi needs " + gallons + " gallons of fuel");
    }
}
