package Capitulo23;

// Demonstra parseInt().

class ParseBinary {
    public static void main(String[] args) {
        int num;

        String str = "10011101";

        num = Integer.parseInt(str, 2);

        System.out.println("Here is " + str + " in decimal: " + num);
    }
}
