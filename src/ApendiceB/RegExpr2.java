package ApendiceB;

// Usa find() para encontrar uma subsequência.

import java.util.regex.*;

class RegExpr2 {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("Alpha");
        Matcher mat = pat.matcher("Alpha Beta Gamma");

        System.out.println("Looking for Alpha in Alpha Beta Gamma.");

        if(mat.find()) System.out.println("subsequence found");
        else System.out.println("No Match");
    }
}
