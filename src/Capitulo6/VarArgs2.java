package Capitulo6;

//Usa varargs com argumentos padrão

class VarArgs2 {
    //Aqui, msg é um parâmetro comum e v é um parâmetro varargs
    static void vaTest(String msg, int ... v) {
        System.out.println(msg + v.length);
        System.out.println("Contents: ");

        for(int i=0; i < v.length; i++)
            System.out.println("  arg " + i + ": " + v[i]);

        System.out.println();
    }
    public static void main(String[] args) {
        vaTest("One vararg: ", 10);
        vaTest("Three varargs: ", 1, 2, 3);
        vaTest("No varargs: ");
    }
}
