package Capitulo24;

// Demonstra Locale.

import java.util.*;

class LocaleDemo {
    public static void main(String[] args) {

        // obtém a localidade padrão.
        Locale defLocale = Locale.getDefault();

        // exibe o nome, o país e o idioma
        System.out.println("Default locale: ");
        System.out.println("Name: " + defLocale.getDisplayName());
        System.out.println("Country: " + defLocale.getDisplayCountry());
        System.out.println("Language: " + defLocale.getDisplayLanguage());
        System.out.println();

        // cria manualmente uma localidade para a Alemanha
        Locale germanLocale = new Locale("de", "DE");
        System.out.println("German locale: ");
        System.out.println("Name: " + germanLocale.getDisplayName());
        System.out.println("Country: " + germanLocale.getDisplayCountry());
        System.out.println("Language: " + germanLocale.getDisplayLanguage());
        System.out.println();

        // agora, usa a localidade padrão para a França.
        System.out.println("Locale.FRANCE: ");
        System.out.println("Name: " + Locale.FRANCE.getDisplayName());
        System.out.println("Country: " + Locale.FRANCE.getDisplayCountry());
        System.out.println("Language: " + Locale.FRANCE.getDisplayLanguage());
    }
}
