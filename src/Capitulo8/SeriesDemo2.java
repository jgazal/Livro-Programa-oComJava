package Capitulo8;

/*A classe SeriesDemo2 usa a mesma variável de referência de interface
para chamar métodos em objetos tanto de ByTwos quanto de ByThrees*/

class SeriesDemo2 {
    public static void main(String[] args) {
        ByTwos twoOb = new ByTwos();
        ByThrees threeOb = new ByThrees();

        Series iRef;    //uma referência de interface

        for(int i=0; i<5; i++){
            iRef = twoOb;   //referencia um objeto ByTwos
            System.out.println("Next ByTwos value is " + iRef.getNext());

            iRef = threeOb; //referencia um objeto ByThrees
            System.out.println("Next ByThrees value is " + iRef.getNext());
        }

    }
}
