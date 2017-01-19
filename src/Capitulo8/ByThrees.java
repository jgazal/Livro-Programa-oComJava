package Capitulo8;

/*Implementa Series de uma maneira diferente.
ByThrees gera uma série composta por múltiplos de três*/

class ByThrees implements Series{
    int start;
    int val;

    ByThrees(){
        start = 0;
        val = 0;
    }
    //Implementa os métodos especificados por Series
    public int getNext(){
        val += 3;       //*
        return val;
    }
    public void reset(){
        val = start;
    }
    public void setStart(int x){
        start = x;
        val = x;
    }
}
