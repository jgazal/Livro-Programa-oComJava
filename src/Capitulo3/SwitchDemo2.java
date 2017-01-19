package Capitulo3;

public class SwitchDemo2 {

    public static void main(String[] args) {
        int i;

        for(i=0; i<10; i++)
            switch (i){
                case 0:
                case 1:
                case 2:
                case 3:
                    System.out.println("i é 0, 1, 2 ou 3");
                    break;
                case 4:
                    System.out.println("i é 4");
                    break;
            }
    }
}
