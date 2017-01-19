package Capitulo10;

//Não funcionará!
class ExcTypeMismatch {
    public static void main(String[] args) {
        int[] nums = new int[4];

        try {
            System.out.println("Before exception is generated.");

            //gera uma exceção de índice fora do limite
            nums[7] = 10;
            System.out.println("this won't be displayed");
        }
        //Não pode capturar um erro de limite de array com uma ArithmeticException
        catch (ArithmeticException exc) {
            //captura a exceção
            System.out.println("Index out-of-bounds!");
        }
        System.out.println("After catch.");
    }
}
