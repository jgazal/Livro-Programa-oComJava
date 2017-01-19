package Capitulo23;

// Demonstra ProcessBuilder.

import java.io.IOException;
class PBDemo {
    public static void main(String[] args) {

        try {
            ProcessBuilder procBldr =
                    new ProcessBuilder("notepad", "testfile");
            procBldr.start();   //Inicia o processo.
        } catch (IOException exc) {
            System.out.println("Error executing notepad.\n" + exc);
        }
    }
}
