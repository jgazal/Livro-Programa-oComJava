package Capitulo5;

//Usa um laço for de estilo for-each

class ForEach {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;

        //Usa o laço for-each para exibir e somar os valores
        for(int x : nums) { //Uma laço for de estilo for-each
            System.out.println("Value is: " + x);
            sum += x;
        }
        System.out.println("Summation: " + sum);
    }
}
