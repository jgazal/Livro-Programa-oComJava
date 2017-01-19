package Capitulo8;

//Esta classe deve implementar tudo que pertence a A e B

class MyClass2 implements B{

    public void meth1(){
        System.out.println("Implement meth1()");
    }
    public void meth2(){
        System.out.println("Implement meth2()");
    }
    public void meth3(){
        System.out.println("Implement meth3()");
    }
}
class IFExtend{
    public static void main(String[] args) {
        MyClass2 ob = new MyClass2();

        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}
