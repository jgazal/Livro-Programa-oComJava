package Capitulo7;

//Demonstra quando os contrutores são executados

class A2 {
    A2() {
        System.out.println("Constructing A.");
    }
}
//Cria uma subclasse estendendo a classe A
class B2 extends A2 {
    B2() {
        System.out.println("Constructing B.");
    }
}
//Cria outra subclasse estendendo B
class C extends B2 {
    C() {
        System.out.println("Constructing C.");
    }
}
class OrderOfConstruction {
    public static void main(String[] args) {
        C c = new C();  //Constói um objeto C
    }
}
