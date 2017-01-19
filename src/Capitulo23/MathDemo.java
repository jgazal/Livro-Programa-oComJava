package Capitulo23;

// Demonstra várias funções de Math.

class MathDemo {
    public static void main(String[] args) {

        // faz a conversão entre radianos e graus
        double theta = 120.0;
        System.out.println(theta + " degrees is " + Math.toRadians(theta) + " radians.");
        theta = 1.312;
        System.out.println(theta + " radians is " + Math.toDegrees(theta) + " degrees\n");

        // demonstra sin() e asin()
        theta = 1.0;
        double sine = Math.sin(theta);
        double asine = Math.asin(sine);
        System.out.println("Sine of " + theta + " is " + sine);
        System.out.println("Arc sine of " + sine + " is " + asine + "\n");

        // encontra a hipotenusa de um triângulo retângulo
        double h = Math.hypot(3.0, 4.0);
        System.out.println("Hypotenuse is " + h + "\n");

        // calcula uma potência
        double p = Math.pow(3.0, 3.0);
        System.out.println("pow(3.0, 3.0) is " + p + "\n");

        // usa log10()
        double lg = Math.log10(100.0);
        System.out.println("log10(100.0) is " + lg + "\n");

        // exibe E e PI
        System.out.println("PI: " + Math.PI + "\n E: " + Math.E);
    }
}
