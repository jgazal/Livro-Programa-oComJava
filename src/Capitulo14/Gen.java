package Capitulo14;

//Uma classe genérica simples.
//Aqui, T é um parâmetro de tipo que será substituído pelo tipo real quando um objeto de tipo Gen for criado.

class Gen<T> {  //Declara uma classe genérica. T é o parâmetro de tipo genérico
    T ob; //declara uma referência a um objeto de tipo T

    //Passa para o construtor uma referência a um objeto de tipo T
    Gen(T o) {
        ob = o;
    }

    //Returna ob
    T getob() {
        return ob;
    }

    //Exibe o tipo de T
    void showType() {
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}

//Demonstra a classe genérica
class GenDemo {
    public static void main(String[] args) {
        // Create a Gen reference for Integers.
        Gen<Integer> iOb;   //Cria uma referência a um objeto de tipo Gen<Integer>

        //Cria um objeto Gen<Integer> e atribui sua referência a iOb.
        //Observe o uso do autoboxing no encapsulamento do valor 88 dentro de um objeto Integer
        iOb = new Gen<Integer>(88); //Instancia um objeto de tipo Gen<Integer>

        //Exibe o tipo de dado usado por iOb
        iOb.showType();

        //Obtém o valor de iOb. Observe que nenhuma coerção é necessária
        int v = iOb.getob();
        System.out.println("value: " + v);

        System.out.println();

        //Cria um objeto Gen para String
        Gen<String> strOb = new Gen<String>("Generics Test");   //Cria uma referência a um objeto de tipo Gen<String>

        //Exibe o tipo de dado usado por strOb
        strOb.showType();

        //Obtém o valor de strOb.Novamente, observe que nenhuma coerção é necessária
        String str = strOb.getob();
        System.out.println("value: " + str);
    }
}

