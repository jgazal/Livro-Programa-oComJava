package Capitulo23;

// Converte um inteiro em binário, hexadecimal e octal.

class StringConversions {
    public static void main(String[] args) {
        int num = 19648;

        System.out.println(num + " in binary: " +  Integer.toBinaryString(num));
        System.out.println(num + " in octal: " + Integer.toOctalString(num));
        System.out.println(num + " in hexadecimal: " + Integer.toHexString(num));
    }
}
