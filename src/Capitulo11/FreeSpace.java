package Capitulo11;

//Mostra o espaço livre na partição atual da unidade

import java.io.*;

class FreeSpace {
    public static void main(String[] args) {
        File myFile = new File("\\");

        System.out.println("Free Space: " + myFile.getFreeSpace());
    }
}
