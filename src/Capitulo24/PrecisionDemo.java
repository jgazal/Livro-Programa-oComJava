package Capitulo24;

// Demonstra o modificador de precisão.

import java.util.*;

class PrecisionDemo {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();

        // Formata 4 casas decimais.
        fmt.format("%.4f\n", 123.1234567);

        // Formata 2 casas decimais em um campo de 16 caracteres
        fmt.format("%16.2e\n", 123.1234567);

        // Exibe no máximo 15 caracteres em um string.
        fmt.format("%.15s\n", "Formatting with Java is now easy.");

        System.out.println(fmt);
        fmt.close();
    }
}
