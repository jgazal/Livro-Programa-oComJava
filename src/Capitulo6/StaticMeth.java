package Capitulo6;

//Usa um método estático

class StaticMeth {
    static int val = 1024; //uma variável estática

    //um método estático
    static int valDiv2() {
        return val/2;
    }
}
class SDemo2 {
    public static void main(String[] args) {

        System.out.println("val is " + StaticMeth.val);
        System.out.println("StaticMeth.valDiv2(): " + StaticMeth.valDiv2());

        StaticMeth.val = 4;
        System.out.println("val is " + StaticMeth.val);
        System.out.println("StaticMeth.valDiv2(): " + StaticMeth.valDiv2());
    }
}
