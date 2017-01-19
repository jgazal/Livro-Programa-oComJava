package Capitulo22;

// Este programa demonstra as duas formas de replace().

class Replace {
    public static void main(String[] args) {
        String orgStr = "alpha beta gamma alpha beta gamma";
        String resultStr;
        System.out.println("Original string: " + orgStr);

        // Primeiro, substitui g por X.
        resultStr = orgStr.replace('g', 'X');
        System.out.println(resultStr);

        // Agora, substitui beta por zeta.
        resultStr = resultStr.replace("beta", "zeta");
        System.out.println(resultStr);
    }
}
