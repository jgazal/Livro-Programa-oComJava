package Capitulo2;

class NestVar {

    public static void main(String[] args) {
        int count;

        for(count = 0; count < 1; count = count+1){
            System.out.println("Este é um contador: " + count);

            //int count; //Inválido!

            for(count = 0; count < 2; count++)
                System.out.println("Erro");
        }
    }
}
