package Capitulo2;

class UseCast {

    public static void main(String[] args) {
        int i;

        for(i = 0; i < 5; i++){
            System.out.println(i + "/3: " + i/3);
            System.out.println(i + "/3 com frações: " + (double) i/3);
            System.out.println();
        }
    }
}
