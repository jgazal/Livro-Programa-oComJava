package Capitulo24;

// Demonstra isLeapYear().

import java.util.*;

class LeapYearDemo {
    public static void main(String[] args) {

        // obtém a data e a hora atuais do sistema
        GregorianCalendar calendar = new GregorianCalendar();

        // obtém o ano atual
        int year = calendar.get(Calendar.YEAR);
        System.out.print(year);

        // verifica se o ano atual é bissexto
        if(calendar.isLeapYear(year)) { //Verifica se o ano é bissexto.
            System.out.println(" is a leap year");
        }
        else {
            System.out.println(" is not a leap year");
        }
    }
}
