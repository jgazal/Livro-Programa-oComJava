package Capitulo14;

// Implementa Containment usando um array para armazenar os valores.
class MyClass<T> implements Containment<T> {
    T[] arrayRef;
    MyClass(T[] o) {
        arrayRef = o;
    }
    // Implementa contains().
    public boolean contains(T o) {
        for(T x : arrayRef)
            if(x.equals(o)) return true;
        return false;
    }
}
class GenIFDemo {
    public static void main(String[] args) {
        Integer[] x = { 1, 2, 3 };
        MyClass<Integer> ob = new MyClass<Integer>(x);
        if(ob.contains(2))
            System.out.println("2 is in ob");
        else
            System.out.println("2 is NOT in ob");
        if(ob.contains(5))
            System.out.println("5 is in ob");
        else
            System.out.println("5 is NOT in ob");
// A parte a seguir não é válida porque ob é um objeto Containment de tipo Integer e 9.25 é um valor Double.
// if(ob.contains(9.25)) // Inválido!
// System.out.println("9.25 is in ob");
    }
}