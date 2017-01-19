package Capitulo3;

class Break2 {

    public static void main(String[] args) throws java.io.IOException{
        char ch;

        for( ; ; ){ //Loop infinito
            ch = (char) System.in.read();
            if(ch == 'q') break;    //Para quando pressionar q
        }
        System.out.println("Você pressionou q!");
    }
}
