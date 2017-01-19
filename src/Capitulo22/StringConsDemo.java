package Capitulo22;

// Demonstra vários construtores de String.

class StringConsDemo {
    public static void main(String[] args) {
        char[] digits = new char[16];

        // Cria um array contendo os dígitos de 0 a 9  mais os valores hexadecimais de A a F.
        for(int i=0; i < 16; i++) {
            if(i < 10) digits[i] = (char) ('0'+i);
            else digits[i] = (char) ('A' + i - 10);
        }
        // Cria um string contendo todo o array.
        String digitsStr = new String(digits);
        System.out.println(digitsStr);

        // Cria um string contendo uma parte do array.
        String nineToTwelve = new String(digits, 9, 4);
        System.out.println(nineToTwelve);

        // Constrói um string a partir de outro.
        String digitsStr2 = new String(digitsStr);
        System.out.println(digitsStr2);

        // Agora, cria um string vazio.
        String empty = new String();

        // Esta linha não exibirá nada:
        System.out.println("Empty string: " + empty);
    }
}