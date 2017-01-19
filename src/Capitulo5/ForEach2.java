package Capitulo5;

//Uso do laço for-each em um array bidimensional

class ForEach2 {

    public static void main(String[] args) {
        int sum = 0;
        int[][] nums = new int[3][5];

        //fornece alguns valores a nums
        for(int i = 0; i < 3; i++)
            for(int j=0; j < 5; j++)
                nums[i][j] = (i+1)*(j+1);

        //usa o laço for-each para exibir e somar os valores
        for(int[] x : nums) {
            for(int y : x) {
                System.out.println("Value is: " + y);
                sum += y;
            }
        }
        System.out.println("Summation: " + sum);
    }
}
