package Capitulo10;

//Demonstra o tratamento de exceções
class ExcDemo1 {
    public static void main(String[] args) {
        int[] nums = new int[4];

        try {   //cria um bloco try
            System.out.println("Before exception is generated.");

            //gera uma exceção de índice fora dos limites
            nums[7] = 10;   //tenta indexar excedendo o limite de nums
            System.out.println("this won't be displayed");
        }
        catch (ArrayIndexOutOfBoundsException exc) {    //captura erros nos limites do array
            //captura a exceção
            System.out.println("Index out-of-bounds!");
        }
        System.out.println("After catch.");
    }
}
