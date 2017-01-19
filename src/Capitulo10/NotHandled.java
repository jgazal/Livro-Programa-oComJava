package Capitulo10;

//Deixa a JVM tratar o erro
class NotHandled {
    public static void main(String[] args) {
        int[] nums = new int[4];

        System.out.println("Before exception is generated.");

        //Gera uma exceção de índice fora do limite
        nums[7] = 10;
    }
}
