package Capitulo6;

//Demonstra a sobrecarga de métodos

class Overload {
    void ovlDemo(){     //primeira versão
        System.out.println("No parameters");
    }
    //sobrecarrega ovlDemo para um parâmetro inteiro
    void ovlDemo(int a) {   //segunda versão
        System.out.println("One parameter: " + a);
    }
    //sobrecarrega ovlDemo para dois parâmetros inteiros
    int ovlDemo(int a, int b) {     //terceira versão
        System.out.println("Two parameters: " + a + " " + b);
        return a + b;
    }
    //sobrecarrega ovlDemo para dois parâmetros double
    double ovlDemo(double a, double b) {        //quarta versão
        System.out.println("Two double parameters: " + a + " " + b);
        return a + b;
    }
}
class OverloadDemo {
    public static void main(String[] args) {
        Overload ob = new Overload();
        int resI;
        double resD;

        //chama todas as versões de ovlDemo()
        ob.ovlDemo();
        System.out.println();

        ob.ovlDemo(2);
        System.out.println();

        resI = ob.ovlDemo(4, 6);
        System.out.println("Result of ob.ovlDemo(4, 6): " + resI);
        System.out.println();

        resD = ob.ovlDemo(1.1, 2.32);
        System.out.println("Result of ob.ovlDemo(1.1, 2.32): " + resD);
    }
}

