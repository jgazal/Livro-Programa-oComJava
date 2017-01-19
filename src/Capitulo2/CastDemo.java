package Capitulo2;

class CastDemo {

    public static void main(String[] args) {
        double x,y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        i = (int) (x/y);    //faz a coerção de double para int. Ocorre perda de informações
        System.out.println("Resultado inteiro de x/y: " + i);

        i = 100;
        b = (byte) i;
        System.out.println("Valor de b: " + b);

        i = 257;    //Há perda de informações. Um byte não pode conter o valor 257
        b = (byte) i;
        System.out.println("valor de b: " + b);

        b = 88; //código ASCII para X
        ch = (char) b;
        System.out.println("ch: " + ch);
    }
}
