package Capitulo3;

class Break4 {

    public static void main(String[] args) {
        int i;

        for(i=1; i<4; i++) {
            one:  {
                two:    {
                    three:    {
                        System.out.println("\ni é " + i);
                        if(i==1) break one; //break com rótulo
                        if(i==2) break two;
                        if(i==3) break three;

                        // essa parte nunca será alcançada
                        System.out.println("Não será impresso");
                    }
                    System.out.println("Após o bloco três.");
                }
                System.out.println("Após o bloco dois.");
            }
            System.out.println("Após o bloco um.");
        }
        System.out.println("Após o for.");
    }
}
