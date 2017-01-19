package Capitulo8;

//Implementa tanto IfA quanto IfB

class MyClass implements IfA, IfB {

    @Override
    public void doSomething() {
        System.out.println("Doing Something");
    }

    @Override
    public void doSomethingElse() {
        System.out.println("Doing something else");
    }

/*    public void doSomething() {
        System.out.println("Doing Something");
    }

    public void doSomethignElse() {
        System.out.println("Doing something else");
    }*/
}

