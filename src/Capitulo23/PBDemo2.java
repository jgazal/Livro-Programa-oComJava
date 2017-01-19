package Capitulo23;

// Espera até o processo ser encerrado.

import java.io.IOException;
class PBDemo2 {
    public static void main(String[] args) {

        try {
            ProcessBuilder procBldr = new ProcessBuilder("notepad", "testfile");
            Process p = procBldr.start();
            p.waitFor();    //Espera o processo terminar
            System.out.println("Notepad returned " + p.exitValue());
        } catch (IOException exc) {
            System.out.println("Error executing notepad.\n" + exc);
        } catch (InterruptedException exc) {
            System.out.println("Wait interrupted\n" + exc);
        }
    }
}
