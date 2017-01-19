package Capitulo24;

// Formatando data e hora.

import java.util.*;
class TimeDateFormat {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();
        GregorianCalendar calendar = new GregorianCalendar();

        // formato padrão de 12 horas
        fmt.format("%tr\n", calendar);

        // informações completas de data e hora
        fmt.format("%tc\n", calendar);

        // somente hora e minuto
        fmt.format("%tl:%tM\n", calendar, calendar);

        // mês por nome e número
        fmt.format("%tB %tb %tm", calendar, calendar, calendar);

        // exibe os formatos
        System.out.println(fmt);
        fmt.close();
    }
}
