package Capitulo22;

// Demonstra charAt() e length().

class CharAtAndLength {
    public static void main(String[] args) {
        String str = "Programming is both art and science.";

        // Percorre todos os caracteres do string.
        for(int i=0; i < str.length(); i++)
            System.out.print(str.charAt(i) + " ");
        System.out.println();
    }
}
