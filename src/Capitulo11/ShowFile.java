package Capitulo11;

/*Exibe um arquivo de texto.

   Para usar este programa, especifique o nome
   do arquivo que deseja ver.
   Por exemplo, para ver um arquivo chamado TEST.TXT, use a linha de comando abaixo.

   java ShowFile TEST.TXT
*/

import java.io.*;

class ShowFile {
    public static void main(String[] args){
        int i;
        FileInputStream fin;

        //Primeiro verifica se um arquivo foi especificado
        if(args.length != 1) {
            System.out.println("Usage: ShowFile File");
            return;
        }
        try {
            fin = new FileInputStream(args[0]);
        } catch(FileNotFoundException exc) {
            System.out.println("File Not Found");
            return;
        }
        try {
            //lê bytes até o EOF ser alcançado
            do {
                i = fin.read(); //lê o arquivo
                if(i != -1) System.out.print((char) i);
            } while(i != -1);   //quando i for igual a -1, o fim do arquivo foi alcançado
        } catch(IOException exc) {
            System.out.println("Error reading file.");
        }
        try {
            fin.close();    //fecha o arquivo
        } catch(IOException exc) {
            System.out.println("Error closing file.");
        }
    }
}
