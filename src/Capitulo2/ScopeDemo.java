package Capitulo2;

class ScopeDemo {

    public static void main(String[] args) {
        int x;
        x = 10;

        if(x == 10){
            int y = 20;
            System.out.println("x e y: " + x + " " + y);

            x = y * 2;
        }
        //y = 100; //Erro! Não é conhecido aqui. y está fora de seu escopo
        System.out.println("x é " + x);
    }
}
