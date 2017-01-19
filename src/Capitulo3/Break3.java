package Capitulo3;

class Break3 {

    public static void main(String[] args) {

        for(int i=0; i<3; i++){
            System.out.println("loop externo: " + i);
            System.out.print(" loop interno: " );

            int t=0;
            while (t < 100) {

                if(t == 10) break;
                System.out.print(t + " ");
                t++;
            }
            System.out.println();
        }
        System.out.println("Loop completo");
    }
}
