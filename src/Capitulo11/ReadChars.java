package Capitulo11;

//Usa um BufferedReader para ler caracteres do console

import java.io.*;

class ReadChars {
    public static void main(String[] args) throws IOException {
        char c;
        //Cria um BufferedReader vinculado a System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter characters, period to quit.");

        //lê caracteres
        do {
            c = (char) br.read();
            System.out.println(c);
        } while(c != '.');
    }
}