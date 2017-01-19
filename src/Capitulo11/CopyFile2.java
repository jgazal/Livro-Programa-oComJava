package Capitulo11;

/* Versão de CopyFile que usa try-with-resources.
   Ela demonstra dois recursos (neste caso, arquivos) sendo
   gerenciado pela mesma instrução try.
*/

import java.io.*;

class CopyFile2 {
    public static void main(String[] args) {
        int i;

        //Primeiro, confirma se os dois arquivos foram especificados
        if(args.length != 2) {
            System.out.println("Usage: CopyFile from to");
            return;
        }

        //Abre e gerencia dois arquivos com a instrução try
        try (FileInputStream fin = new FileInputStream(args[0]);    //Gerencia
             FileOutputStream fout = new FileOutputStream(args[1])) //dois recursos
        {

            do {
                i = fin.read();
                if(i != -1) fout.write(i);
            } while(i != -1);

        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}
