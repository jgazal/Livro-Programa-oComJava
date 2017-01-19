package Capitulo24;

// Usa o gerenciamento automático de recursos com Formatter.

import java.util.*;

class FormatDemo2 {
    public static void main(String[] args) {

        try (Formatter fmt = new Formatter()) {
            fmt.format("Formatting %s is easy %d %f", "with Java",
                    10, 98.6);
            System.out.println(fmt);
        }
    }
}
