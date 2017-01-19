package ApendiceB;

// Usa replaceAll().

import java.util.regex.*;

class RegExpr7 {
    public static void main(String[] args) {
        String str = "Jon Jonathan Frank Ken Todd";
        Pattern pat = Pattern.compile("Jon.*? ");
        Matcher mat = pat.matcher(str);

        System.out.println("Original sequence: " + str);

        str = mat.replaceAll("Eric ");

        System.out.println("Modified sequence: " + str);
    }
}
