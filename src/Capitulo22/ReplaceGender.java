package Capitulo22;

// Exercício 9

import java.io.*;

public class ReplaceGender {

    public static void main(String[] args) throws IOException {

        // cria um BufferedReader usando System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;

        str = br.readLine();
        str = str.replace(" he ", " she ");
        str = str.replace("His ", "Her ");
        str = str.replace("He ", "She ");
        str = str.replace(" his ", " her ");
        str = str.replace(" him ", " her ");

        System.out.println(str);
    }
}
