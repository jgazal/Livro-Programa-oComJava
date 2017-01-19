package Capitulo22;

// Demonstra compareTo() e comparToIgnoreCase().

class CompareStrings {
    public static void main(String[] args) {
        String str1 = "alpha";
        String str2 = "ALPHA";
        String str3 = "Beta";
        int result;

        // Demonstra as diferenças entre compareTo() e compareToIgnoreCase().
        result = str1.compareTo(str2);
        if(result != 0)
            System.out.println("Using compareTo(): " +
                    str1 + " and " + str2 + " differ");
        result = str1.compareToIgnoreCase(str2);
        if(result == 0)
            System.out.println("Using compareToIgnoreCase(): " +
                    str1 + " and " + str2 + " are the same\n");

        // Agora, compara alpha com Beta usando compareTo().
        System.out.println("Using compareTo() to compare " + str1 +
                " with " + str3);
        result = str1.compareTo(str3);
        if(result < 0)
            System.out.println(str1 + " is less than " + str3);
        else if(result == 0)
            System.out.println(str1 + " is equal to " + str3);
        else if(result > 0)
            System.out.println(str1 + " is greater than " + str3);
        System.out.println();

        // Em seguida, compara alpha com Beta usando compareToIgnoreCase().
        System.out.println("Using compareToIgnoreCase() to compare " +
                str1 + " with " + str3);
        result = str1.compareToIgnoreCase(str3);
        if(result < 0)
            System.out.println(str1 + " is less than " + str3);
        else if(result == 0)
            System.out.println(str1 + " is equal to " + str3);
        else if(result > 0)
            System.out.println(str1 + " is greater than " + str3);
    }
}
