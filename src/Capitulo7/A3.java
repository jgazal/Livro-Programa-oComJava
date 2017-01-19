package Capitulo7;

//Sobreposição de métodos

class A3 {
    int i, j;

    A3(int a, int b){
      i = a;
        j = b;
    }
    //exibe i e j
    void show(){
        System.out.println("i and j: " + i + " " + j);
    }
}
class B3 extends A3{
    int k;

    B3(int a, int b, int c){
        super(a, b);
        k = c;
    }
    //exibe k. Esta versão sobrepõe show() em A
    void show(){
        super.show();   //Essa instrução chama o método show() de A
        System.out.println("k: " + k);
    }
}
class Override{
    public static void main(String[] args) {
        B3 subOB = new B3(1, 2, 3);

        subOB.show();   //Essa instrução chama show() de B
    }
}

