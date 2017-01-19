package Capitulo4;

class ChkNum {

    //Retorna true se x for par
    boolean isEven(int x){  //Aqui, x é um parâmetro inteiro de isEven()
        if((x%2) == 0) return true;
        else return false;
    }
}
class ParmDemo{

    public static void main(String[] args) {
        ChkNum e = new ChkNum();

        if(e.isEven(10)) System.out.println("10 é par");    //Passa argumentos para isEven()
        if(e.isEven(9)) System.out.println("9 é par");
        if(e.isEven(8)) System.out.println("8 é par");
    }
}
