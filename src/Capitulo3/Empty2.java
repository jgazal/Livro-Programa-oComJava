package Capitulo3;

class Empty2 {

    public static void main(String[] args) {
        int i;

        i = 0;  //Expressão de inicialização removida do laço

        for( ; i<10 ; ){
            System.out.println("#" + i);
            i++;    //Expressão de iteração no corpo do laço
        }
    }
}
