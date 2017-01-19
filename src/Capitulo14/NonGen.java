package Capitulo14;

// Uma classe não genérica pode ser superclasse de uma subclasse genérica.
// Classe não genérica.
class NonGen {
    int num;
    NonGen(int i) {
        num = i;
    }
    int getnum() {
        return num;
    }
}
// Subclasse genérica.
class Generica<T> extends NonGen {
    T ob; // declara um objeto de tipo T
    // Passa para o construtor uma referência a um objeto de tipo T.
    Generica(T o, int i) {
        super(i);
        ob = o;
    }
    //Retorna ob.
    T getob() {
        return ob;
    }
}
