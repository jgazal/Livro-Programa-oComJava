package Capitulo3;

//Exibe os números pares entre 0 e 100

class ContDemo {

    public static void main(String[] args) {
        int i;

        for(i=0; i<=100; i++){
            if((i%2) != 0) continue;
            System.out.println(i);
        }
    }
}
