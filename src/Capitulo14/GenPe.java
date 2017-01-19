package Capitulo14;

// Sobreposição de um método genérico de uma classe genérica.
class GenPe<T> {
    T ob; // declara um objeto de tipo T
    // Passa para o construtor uma referência a um objeto de tipo T.
    GenPe(T o) {
        ob = o;
    }
    // Retorna ob.
    T getob() {
        System.out.print("Gen’s getob(): " );
        return ob;
    }
}
// Subclasse de Gen que sobrepõe getob().
class GenPe2<T> extends GenPe<T> {
    GenPe2(T o) {
        super(o);
    }
    // Sobrepõe getob().
    T getob() {
        System.out.print("Gen2’s getob(): ");
        return ob;
    }
}
// Demonstra a sobreposição de um método genérico.
class OverrideDemo {
    public static void main(String[] args) {
// Uma referência Gen que pode apontar para qualquer tipo de objeto Gen.
        GenPe<?> gRef;
// Cria um objeto Gen para Integers.
        GenPe<Integer> iOb = new GenPe<Integer>(88);
// Cria um objeto Gen2 para Integers.
        GenPe2<Integer> iOb2 = new GenPe2<Integer>(99);
        // Cria um objeto Gen2 para Strings.
        GenPe2<String> strOb2 = new GenPe2<String> ("Generics Test");
        gRef = iOb;
        System.out.println(gRef.getob());
        gRef = iOb2;
        System.out.println(gRef.getob());
        gRef = strOb2;
        System.out.println(gRef.getob());
    }
}
