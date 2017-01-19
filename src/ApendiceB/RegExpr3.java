package ApendiceB;

// Usa find() para encontrar várias subsequências.

import java.util.regex.*;

class RegExpr3 {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("Beta");
        Matcher mat = pat.matcher("Alpha Beta Gamma Beta Theta");

        while(mat.find()) {
            System.out.println("Beta found at index " + mat.start());
        }
    }
}