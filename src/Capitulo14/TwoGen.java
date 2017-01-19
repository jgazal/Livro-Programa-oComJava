package Capitulo14;

//Classe genérica simples com dois parâmetros de tipo: T e V
class TwoGen<T, V> {    //Usa dois parâmetros de tipo
    T ob1;
    V ob2;

    //Passa para o construtor referências a objetos de tipo T e V
    TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }

    //Exibe os tipos de T e V
    void showTypes() {
        System.out.println("Type of T is " + ob1.getClass().getName());

        System.out.println("Type of V is " + ob2.getClass().getName());
    }

    T getob1() {
        return ob1;
    }

    V getob2() {
        return ob2;
    }
}

//Demonstra TwoGen
class SimpGen {
    public static void main(String[] args) {
        //Aqui, Integer é passado para T e String é passado para V
        TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Generics");

        //Exibe os tipos
        tgObj.showTypes();

        //Obtém e exibe valores
        int v = tgObj.getob1();
        System.out.println("value: " + v);

        String str = tgObj.getob2();
        System.out.println("value: " + str);
    }
}
