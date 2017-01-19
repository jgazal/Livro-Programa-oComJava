package Capitulo1;

class IfDemo {

    public static void main(String[] args) {
        int a,b,c;

        a = 2;
        b = 3;

        if(a < b) System.out.println("a é menor que b");

        if(a == b) System.out.println("Você não verá isso");

        System.out.println();

        c = a - b;  //c contém -1

        System.out.println("c contém -1");

        if(c >= 0) System.out.println("c não é negativo");
        if(c < 0) System.out.println("c é negativo");

        System.out.println();

        c = b - a;  //agora c contém 1

        System.out.println("c contém 1");

        if(c >= 0) System.out.println("c não é negativo");
        if(c < 0) System.out.println("c é negativo");
    }
}
