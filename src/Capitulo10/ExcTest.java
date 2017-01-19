package Capitulo10;

//Uma exceção pode ser gerada por um método e capturada por outro
class ExcTest {
    //Gera uma exceção
    static void genException() {
        int[] nums = new int[4];

        System.out.println("Before exception is generated.");

        //Gera uma exceção de índice fora do limite
        nums[7] = 10;   //a exceção é gerada aqui
        System.out.println("this won't be displayed");
    }
}
class ExcDemo2 {
    public static void main(String[] args) {

        try {
            ExcTest.genException();
        } catch (ArrayIndexOutOfBoundsException exc) {  //a exceção é capturada aqui
            //Captura a exceção
            System.out.println("Index out-of-bounds!");
        }
        System.out.println("After catch.");
    }
}
