package Capitulo3;

class SwitchDemo {

    public static void main(String[] args) {
        int i;

        for(i=0; i<10; i++)
            switch (i){
                case 0:
                    System.out.println("i é 0");
                    break;
                case 1:
                    System.out.println("i é 1");
                    break;
                case 2:
                    System.out.println("i é 2");
                    break;
                case 3:
                    System.out.println("i é 3");
                    break;
                case 4:
                    System.out.println("i é 4");
                    break;
                default:
                    System.out.println("i é maior ou igual a 5");
            }
    }
}
