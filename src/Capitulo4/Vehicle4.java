package Capitulo4;

class Vehicle4 {

    int passengers; //Nº de passageiros
    int fuelCap;    //Capacidade de armazenamento de combustível em galões
    int mpg;        //Consumo de combustível em milhas por galão

    //Retorna a autonomia
    int range(){
        return fuelCap * mpg;   //Retorna a autonomia de um determinado veículo
    }
}

class RetMeth{

    public static void main(String[] args) {
        Vehicle4 minivan = new Vehicle4();
        Vehicle4 sportscar = new Vehicle4();

        int range1, range2;

        //Atribui valores a campos de minivan
        minivan.passengers = 7;
        minivan.fuelCap = 16;
        minivan.mpg = 21;

        //Atribui valores a campos de sportscar
        sportscar.passengers = 2;
        sportscar.fuelCap = 14;
        sportscar.mpg = 12;

        //Obtém as autonomias
        range1 = minivan.range();   //Atribui o valor retornado a uma variável
        range2 = sportscar.range(); //Atribui o valor retornado a uma variável

        System.out.println("Minivan can carry " + minivan.passengers + " with range of " + range1 + " miles");
        System.out.println("Sportscar can carry " + sportscar.passengers + " with range of " + range2 + " miles");
    }
}
