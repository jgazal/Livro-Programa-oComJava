package Capitulo4;

class Factor {

    //Retorna true se a for fator de b
    boolean isFactor(int a, int b){
        if((b%a) == 0) return true;
        else return false;
    }
}
class isFact{

    public static void main(String[] args) {
        Factor x = new Factor();

        if(x.isFactor(2, 20)) System.out.println("2 é fator");  //Passa dois argumentos para isFacto()
        if(x.isFactor(3, 20)) System.out.println("Isso não será mostrado");
    }
}
