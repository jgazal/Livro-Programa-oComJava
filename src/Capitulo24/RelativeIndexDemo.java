package Capitulo24;

// Usa índices relativos para simplificar a criação de um formato de data e hora personalizado.

import java.util.*;

class RelativeIndexDemo {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();
        GregorianCalendar calendar = new GregorianCalendar();

        fmt.format("Today is day %te of %<tB, %<tY", calendar);
        System.out.println(fmt);
        fmt.close();
    }
}