package Capitulo1;

class Example2 {

    public static void main(String[] args) {
        int var1; // declara uma variável
        int var2; // declara outra variável
        // poderia ter sido declarado assim: int var1, var2

        var1 = 1024; // atribui o valor 1024 a var1

        System.out.println("var1 contém " + var1);

        var2 = var1 / 2;

        System.out.print("var2 contém var1/2: ");
        System.out.println(var2);
    }
}
