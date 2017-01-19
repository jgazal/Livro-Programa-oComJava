package Capitulo6;

//Usa BitOut como classe local

class LocalClassDemo {
    public static void main(String[] args) {

        //Uma versão de BitOut como classe interna
        class BitOut {
            int numBits;

            BitOut(int n) {
                if(n < 1) n = 1;
                if(n > 64) n = 64;
                numBits = n;
            }
            void show(long val) {
                long mask = 1;
                //desloca uma unidade para a esquerda para a posição apropriada
                mask <<= numBits-1;

                int spacer =  8 - (numBits % 8);
                for(; mask != 0; mask >>>= 1) {
                    if((val & mask) != 0) System.out.print("1");
                    else System.out.print("0");
                    spacer++;
                    if((spacer % 8) == 0) {
                        System.out.print(" ");
                        spacer = 0;
                    }
                }
                System.out.println();
            }
        }
        for(byte b = 0; b < 10; b++) {
            BitOut byteval = new BitOut(8);

            System.out.print(b + " in binary: ");
            byteval.show(b);
        }
    }
}

