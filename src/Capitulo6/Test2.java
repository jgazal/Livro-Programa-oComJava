package Capitulo6;

//Objetos são passados por suas referências

class Test2 {
    int a,b;

    Test2(int i, int j){
        a = i;
        b = j;
    }
    //Passa um objeto. Agora, os valores ob.a e ob.b do objeto usados na chamada serão alterados
    void change(Test2 ob){
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
}
class PassObjetcRef{
    public static void main(String[] args) {
       Test2 ob = new Test2(15,20);

        System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);

        ob.change(ob);

        System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
    }
}
