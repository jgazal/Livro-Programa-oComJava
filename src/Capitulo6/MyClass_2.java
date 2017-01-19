package Capitulo6;

//Demonstra um contrutor sobrecarregado

class MyClass_2 {
    int x;

    MyClass_2() {
        System.out.println("Inside MyClass().");
        x = 0;
    }
    MyClass_2(int i) {
        System.out.println("Inside MyClass(int).");
        x = i;
    }
    MyClass_2(double d) {
        System.out.println("Inside MyClass(double).");
        x = (int) d;
    }
    MyClass_2(int i, int j) {
        System.out.println("Inside MyClass(int, int).");
        x = i * j;
    }
}
class OverloadConsDemo {
    public static void main(String[] args) {
        MyClass_2 t1 = new MyClass_2();
        MyClass_2 t2 = new MyClass_2(88);
        MyClass_2 t3 = new MyClass_2(17.23);
        MyClass_2 t4 = new MyClass_2(2, 4);

        System.out.println("t1.x: " + t1.x);
        System.out.println("t2.x: " + t2.x);
        System.out.println("t3.x: " + t3.x);
        System.out.println("t4.x: " + t4.x);
    }
}

