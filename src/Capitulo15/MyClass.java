package Capitulo15;

//Seção Pergunte ao Especialista, página 556

class MyClass {
    int a;
    int b;
    // Inicializa a e b individualmente.
    MyClass(int i, int j) {
        a = i;
        b = j;
    }
    // Usa this() para inicializar a e b com o mesmo valor.
    MyClass(int i) {
        this(i, i); // chama MyClass(I, i)
    }
}
