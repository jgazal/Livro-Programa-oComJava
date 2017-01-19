package ApendiceB;

// Uma demonstração simples da comparação de padrões.

import java.util.regex.*;

class RegExpr {
    public static void main(String[] args) {
        Pattern pat;
        Matcher mat;
        boolean found;

        pat = Pattern.compile("Alpha");
        mat = pat.matcher("Alpha");
        found = mat.matches(); // procura uma ocorrência

        System.out.println("Testing Alpha against Alpha.");
        if(found) System.out.println("Matches");
        else System.out.println("No Match");

        System.out.println();

        System.out.println("Testing Alpha against Alpha Beta Gamma.");
        mat = pat.matcher("Alpha Beta Gamma"); // cria um novo comparador

        found = mat.matches(); // procura uma ocorrência

        if(found) System.out.println("Matches");
        else System.out.println("No Match");
    }
}
