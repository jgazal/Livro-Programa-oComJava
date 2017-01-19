package Capitulo3;

/*O programa exibe o padrão de asteriscos mostrado. Modifique para que mostre os outros padrões.

*
**
***
****
******/

class Ex20_StarPattern {
//Padrão:
    public static void main(String args[]) {
        int i, j;
        for(i=1; i<=5; i++) {
            for(j=1; j<=i; j++)
                System.out.print("*");
            System.out.println();
    }
}

    //Padrão A:
/*    public static void main(String args[]) {
        int i, j;
        for(i=0; i<5; i++) {
            for(j=i; j<5; j++)
                System.out.print("*");
            System.out.println();
        }
    }*/

    //Padrão B:
/*    public static void main(String[] args){
        int i, j, k;
        for(i=5; i>=1; i--) {
            for(j=1; j<=i; j++) {
                System.out.print(" ");
            }
            for(k=5; k>=i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }*/

    //Padrão C:
/*    public static void main(String[] args) {
        int i, j, k;
        for(i=6; i>=1; i--){
            for(j=6; j>i; j--){
                System.out.print(" ");
            }
            for(k=2; k<(i*2); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }*/
}

