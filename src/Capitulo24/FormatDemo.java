package Capitulo24;

// Um exemplo muito simples que usa Formatter.

import java.util.*;

class FormatDemo {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();

        fmt.format("Formatting %s is easy %d %f", "with Java", 10, 98.6);   //Cria a saída formatada.

        System.out.println(fmt);    //Exibe a saída formatada.
        fmt.close();
    }
}
