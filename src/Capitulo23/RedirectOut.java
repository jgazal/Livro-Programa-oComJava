package Capitulo23;

// Redireciona System.out para um arquivo.

import java.io.*;

class RedirectOut {
    public static void main(String[] args) throws IOException {

        // Primeiro, confirma se um arquivo foi especificado.
        if(args.length != 1) {
            System.out.println("RedirectOut: to");
            return;
        }
        // Cria um PrintStream vinculado ao arquivo especificado.
        try (PrintStream fout = new PrintStream(args[0])) {

            // salva o System.out original
            PrintStream orgOut = System.out;

            // redireciona System.out para o arquivo.
            System.setOut(fout);    //Redireciona System.out para fout

            // observe que System.out é usado aqui
            System.out.println("This goes in the file.");

            // restaura o System.out original
            System.setOut(orgOut);
            System.out.println("This is shown on the screen.");
        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}