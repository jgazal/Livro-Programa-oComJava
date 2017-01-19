package Capitulo8;

//Um exemplo de interface aninhada

interface A2 {
    //Esta é uma interface aninhada
    public interface NestedIF{
        boolean isNotNegative(int x);
    }
    void doSomething();
}
//Esta classe implementa a interface aninhada
class B2 implements A2.NestedIF{
    public boolean isNotNegative(int x){
        return x<0 ? false : true;
    }
}
class NestedIFDemo{
    public static void main(String[] args) {
        //usa uma referência de interface aninhada
        A2.NestedIF nif = new B2();

        if(nif.isNotNegative(10))
            System.out.println("10 is not negative");
        if(nif.isNotNegative(-12))
            System.out.println("this won't be displayed");
    }
}
