package Capitulo22;

// Usando trim() para processar comandos.

import java.io.*;
class UseTrim {
    public static void main(String[] args)
            throws IOException {

        // cria um BufferedReader usando System.in
        BufferedReader br = new
                BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter 'stop' to quit.");
        System.out.println("Enter State: ");
        do {
            str = br.readLine();
            str = str.trim(); // remove o espaço em branco. Usa trim( ) para remover o espaço em branco
                              // inicial e final do string inserido pelo usuário.
            if(str.equals("Illinois"))
                System.out.println("Capital is Springfield.");
            else if(str.equals("Missouri"))
                System.out.println("Capital is Jefferson City.");
            else if(str.equals("California"))
                System.out.println("Capital is Sacramento.");
            else if(str.equals("Washington"))
                System.out.println("Capital is Olympia.");
// ...
        } while(!str.equals("stop"));
    }
}
