package Capitulo3;

class Break6 {

    public static void main(String[] args) {
        int x=0, y=0;
        //insere o rótulo antes da instrução for
        stop1: for(x=0; x < 5; x++) {
            for(y = 0; y < 5; y++) {
                if(y == 2) break stop1;
                System.out.println("x e y: " + x + " " + y);
            }
        }

        System.out.println();

        // insere o rótulo antes da chave {
        for(x=0; x < 5; x++)
            stop2: {
                for(y = 0; y < 5; y++) {
                    if(y == 2) break stop2;
                    System.out.println("x e y: " + x + " " + y);
                }
            }
    }
}
