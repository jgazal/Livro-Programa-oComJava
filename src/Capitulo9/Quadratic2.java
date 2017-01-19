package Capitulo9;

//Usa a importação estática para tornar sqrt() e pow() visíveis
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

class Quadratic2 {
    public static void main(String[] args) {

        // a, b, e c representam os coeficientes
        // da equação quadrática: ax² + bx + c = 0
        double a, b, c, x;

        // Resolve 4x² + x - 3 = 0 para achar
        a = 4;
        b = 1;
        c = -3;

        //Encontra a primeira solução
        x = (-b + sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.println("First solution: " + x);

        //Econtra a segunda solução
        x = (-b - sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.println("Second solution: " + x);
    }
}