package Capitulo3;

class Ladder {

    public static void main(String[] args) {
        int x;

        for(x=0; x<6; x++){
            if(x==1)
                System.out.println("x é 1");
            else if(x==2)
                System.out.println("x é 2");
            else if(x==3)
                System.out.println("x é 3");
            else if(x==4)
                System.out.println("x é 4");
            else
                System.out.println("x não está entre 1 e 4");
        }
    }
}
