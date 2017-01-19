package Capitulo7;

//Uma referência de superclasse pode referenciar um objeto da subclasse

class X {
    int a;

    X(int i){a = i;}
}
class Y extends X{
    int b;

    Y(int i, int j){
        super(j);

        b = i;
    }
}
class SupSubRef{
    public static void main(String[] args) {
        X x = new X(10);
        X x2;
        Y y = new Y(5, 6);

        x2 = x; //Correto, as duas são do mesmo tipo
        System.out.println("x2.a: " + x2.a);

        x2 = y; //Correto porque Y é derivada de X. Y é subclasse de X, logo, x2 pode referenciar y
        System.out.println("x2.a: " + x2.a);

        //Referências de X só conhecem membros de X
        x2.a = 19;  //OK
        //x2.b = 27;    //Erro! X não tem membro b
    }
}
