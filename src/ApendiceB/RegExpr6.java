package ApendiceB;

// Usa uma classe de caracteres.

import java.util.regex.*;

class RegExpr6 {
    public static void main(String[] args) {
        // Procura palavras em minúsculas.
        Pattern pat = Pattern.compile("[a-z]+");
        Matcher mat = pat.matcher("this is a test.");

        while(mat.find())
            System.out.println("Match: " + mat.group());
    }
}
