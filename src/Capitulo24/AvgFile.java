package Capitulo24;

// Usa Scanner para calcular a média dos valores de um arquivo.

import java.util.*;
import java.io.*;

class AvgFile {
    public static void main(String[] args) throws IOException {

        int count = 0;
        double sum = 0.0;

        // Grava saídas em um arquivo.
        FileWriter fout = new FileWriter("test.txt");
        fout.write("2 3.4 5 6 7.4 9.1 10.5 done");
        fout.close();

        FileReader fin = new FileReader("Test.txt");

        Scanner src = new Scanner(fin); //Cria um Scanner que lê em um arquivo.

        // Lê e soma os números.
        while(src.hasNext()) {
            if(src.hasNextDouble()) {
                sum += src.nextDouble();
                count++;
            }
            else {
                String str = src.next();
                if(str.equals("done")) break;
                else {
                    System.out.println("File format error.");
                    return;
                }
            }
        }
        src.close();
        System.out.println("Average is " + sum / count);
    }
}
