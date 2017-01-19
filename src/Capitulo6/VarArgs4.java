package Capitulo6;

//Varargs, sobrecarga e ambiguidade.
//Este programa contém um erro e não será compilado!

class VarArgs4 {

    //Usa um parâmetro vararg int
    static void vaTest(int ... v) {
        // ...
    }
    //Usa um parâmetro vararg booleano
    static void vaTest(boolean ... v) {
        // ...
    }
    public static void main(String[] args) {
        vaTest(1, 2, 3); // OK
        vaTest(true, false, false); // OK

        //vaTest(); // Erro: Ambíguo!
    }
}
