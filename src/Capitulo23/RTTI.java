package Capitulo23;

// Demonstra a obtenção de informações de tipo no tempo de execução.

class X {
    int a;
    float b;
}

class Y extends X {
    double c;
}

class RTTI {
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        Class<?> clObj;

        clObj = x.getClass(); // obtém referência Class
        System.out.println("x is object of type: " + clObj.getName());

        clObj = y.getClass(); // obtém referência Class
        System.out.println("y is object of type: " + clObj.getName());

        clObj = clObj.getSuperclass(); //Observe como a superclasse é obtida.
        System.out.println("y's superclass is " + clObj.getName());
    }
}
