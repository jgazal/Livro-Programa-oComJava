package Capitulo13;

/*O Autoboxing/unboxing ocorre com parâmetros
e o valor de retorno de métodos*/

class AutoBox2 {
    //Esse método tem um parâmetro Integer
    static void m(Integer v) {  //Recebe um Integer
        System.out.println("m() received " + v);
    }

    //Esse método retorna um int
    static int m2() {
        return 10;
    }

    //Esse método retorna um Integer.
    static Integer m3() {
        return 99; //faz o autoboxing de 99 para um Integer
    }

    public static void main(String[] args) {

        //Passa um int para m(). Já que m() tem um parâmetro Integer,
        //o valor int passado é encapsulado automaticamente
        m(199);

        //Aqui, iOb receve o valor int retornado por m2().
        //Esse valor é encapsulado automaticamente para
        //poder ser atribuído a iOb
        Integer iOb = m2();
        System.out.println("Return value from m2() is " + iOb);

        //Em seguida, m3() é chamado. Ele retorna um valor Integer
        //que é encapsulado automaticamente em um int
        int i = m3();
        System.out.println("Return value from m3() is " + i);

        //Agora, Math.sqrt() é chamado com iOb como argumento.
        //Nesse caso, iOb sofre autounboxing e seu valor é promovido
        //a double, que é o tipo que sqrt() precisa
        iOb = 100;
        System.out.println("Square root of iOb is " + Math.sqrt(iOb));
    }
}

