package Capitulo3;

class SqrRoot {

    public static void main(String[] args) {
        double num,sroot;

        for(num=1.0; num<100.0; num++){
            sroot = Math.sqrt(num);
            System.out.println("A raíz quadrada de " + num + " é " + sroot);
        }
    }
}
