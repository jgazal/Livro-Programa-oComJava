package Capitulo2;

class Hypotenuse {

    public static void main(String[] args) {
        double side1, side2, hypot;

        side1 = 3;
        side2 = 4;

        hypot = Math.sqrt(side1 * side1 + side2 * side2);   //Hipotenusa = raiz quadrade de (side1² + side2²)

        System.out.println("Hipotenusa: " + hypot);
    }
}
