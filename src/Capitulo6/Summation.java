package Capitulo6;

//Inicializa um objeto com outro

class Summation {
    int sum;

    //Constrói a partir de um int
    Summation(int num) {
        sum = 0;
        for(int i=1; i <= num; i++)
            sum += i;
    }
    //Constrói a partir de outro objeto
    Summation(Summation ob) {
        sum = ob.sum;
    }
}
class SumDemo {
    public static void main(String[] args) {
        Summation s1 = new Summation(5);
        Summation s2 = new Summation(s1);

        System.out.println("s1.sum: " + s1.sum);
        System.out.println("s2.sum: " + s2.sum);
    }
}
