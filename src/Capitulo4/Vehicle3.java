package Capitulo4;

class Vehicle3 {

    int passengers; //Nº de passageiros
    int fuelCap;    //Capacidade de armazenamento de combustível em galões
    int mpg;        //Consumo de combustível em milhas por galão

    //Exibe a autonomia
    void range(){   //O método range() está contido classe Vehicle
        System.out.println("Range is " + fuelCap * mpg);
    }
}
class AddMeth{

    public static void main(String[] args) {
        Vehicle3 minivan = new Vehicle3();
        Vehicle3 sportscar = new Vehicle3();

        int range1, range2;

        //Atribui valores a campos de minivan
        minivan.passengers = 7;
        minivan.fuelCap = 16;
        minivan.mpg = 21;

        //Atribui valores a campos de sportscar
        sportscar.passengers = 2;
        sportscar.fuelCap = 14;
        sportscar.mpg = 12;

        System.out.print("Minivan can carry " + minivan.passengers + ". ");
        minivan.range();    //Exibe a autonomia de minivan

        System.out.print("Sportscar can carry " + sportscar.passengers + ". ");
        sportscar.range();  //Exibe a autonomia de sportscar

    }
}
