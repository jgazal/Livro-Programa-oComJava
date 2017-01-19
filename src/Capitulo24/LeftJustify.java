package Capitulo24;

// Demonstra o alinhamento à esquerda.

import java.util.*;
class LeftJustify {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();

        // Alinha à direita por padrão
        fmt.format("|%10.2f|\n", 123.123);

        // Agora, alinha à esquerda.
        fmt.format("|%-10.2f|", 123.123);

        System.out.println(fmt);
        fmt.close();
    }
}
