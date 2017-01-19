package Capitulo8;

//Implementa Series

class ByTwos implements Series {
    int start;
    int val;
    int priorVal;   //

    ByTwos(){
        start = 0;
        val = 0;
        priorVal = -2;
    }
    //Implementa os métodos especificados por Series
    public int getNext(){
        priorVal = val; //
        val += 2;
        return val;
    }
    public void reset(){
        val = start;
        priorVal = start - 2;
    }
    public void setStart(int x){
        start = x;
        val = x;
        priorVal = x - 2;   //
    }
    //Retorna o valor anterior. Esse método não é definido por Series
    int getPriorVal(){  //
        return priorVal;
    }
}
//Demonstra o uso de Series
class SeriesDemo{
    public static void main(String[] args) {
        ByTwos ob = new ByTwos();

        for(int i=0; i<5; i++)
            System.out.println("Next value is " + ob.getNext());

        System.out.println("\nResetting");
        ob.reset();
        for(int i=0; i<5; i++)
            System.out.println("Next value is " + ob.getNext());

        System.out.println("\nStarting at 100");
        ob.setStart(100);
        for(int i=0; i<5; i++)
            System.out.println("Next value is " + ob.getNext());

    }
}
