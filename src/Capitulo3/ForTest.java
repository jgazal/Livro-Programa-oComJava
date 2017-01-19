package Capitulo3;

class ForTest {

    public static void main(String[] args) throws java.io.IOException{
        int i;

        System.out.println("Aperte a tecla S para parar");

        for(i=0; (char) System.in.read() != 'S'; i++)
            System.out.println("#" + i);
    }
}
