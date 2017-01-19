package Capitulo11;

//Lê um array de bytes a partir do teclado

import java.io.*;

class ReadBytes {
    public static void main(String[] args) throws IOException {
        byte[] data = new byte[10];

        System.out.println("Enter some characters.");
        int numRead = System.in.read(data); //lê um array de bytes a partir do teclado
        System.out.print("You entered: ");

        for(int i=0; i < numRead; i++)
            System.out.print((char) data[i]);
    }
}