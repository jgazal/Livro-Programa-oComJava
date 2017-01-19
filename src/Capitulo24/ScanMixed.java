package Capitulo24;

// Usa Scanner para ler vários tipos de dados em um arquivo.

import java.util.*;
import java.io.*;

class ScanMixed {
    public static void main(String[] args) throws IOException {

        int i;
        double d;
        boolean b;
        String str;

        // Grava saídas em um arquivo.
        FileWriter fout = new FileWriter("test.txt");
        fout.write("Testing Scanner 10 12.2 one true two false");
        fout.close();

        FileReader fin = new FileReader("Test.txt");

        Scanner src = new Scanner(fin);

            // Lê até o fim.
            while (src.hasNext()) {
                if (src.hasNextInt()) {  //Procura diferentes tipos de dados.
                    i = src.nextInt();
                    System.out.println("int: " + i);
                } else if (src.hasNextDouble()) {  //Procura diferentes tipos de dados.
                    d = src.nextDouble();
                    System.out.println("double: " + d);
                } else if (src.hasNextBoolean()) { //Procura diferentes tipos de dados.
                    b = src.nextBoolean();
                    System.out.println("boolean: " + b);
                } else {
                    str = src.next();
                    System.out.println("String: " + str);
                }
            }
            src.close();
        }
    }

