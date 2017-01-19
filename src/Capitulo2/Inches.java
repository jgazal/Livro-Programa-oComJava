package Capitulo2;

class Inches {

    public static void main(String[] args) {
        long cubicInches;
        long inchesPerMile;

        inchesPerMile = 5280 * 12;  //Calcula quantas polegadas há em uma milha. 1 milha = 5280 pés
        cubicInches = inchesPerMile * inchesPerMile * inchesPerMile;    //calcula polegas cúbicas

        System.out.println("Existem " + cubicInches + " polegadas cúbicas em uma milha cúbica");


    }
}
