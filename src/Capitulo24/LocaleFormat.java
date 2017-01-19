package Capitulo24;

// Demonstra uma diferença de formatação baseada na localidade.

import java.util.*;

class LocaleFormat {
    public static void main(String[] args) {
        Formatter usFmt = new Formatter(Locale.US);
        Formatter germanFmt = new Formatter(Locale.GERMAN);
        double n = 1234567.24;
        usFmt.format("English: %,.2f", n);
        System.out.println(usFmt);
        usFmt.close();

        germanFmt.format("German: %,.2f", n);
        System.out.println(germanFmt);
        germanFmt.close();
    }
}
