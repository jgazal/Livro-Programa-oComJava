package Capitulo23;

// Demonstra destroy().

import java.io.IOException;
class PBDemo3 {
    public static void main(String[] args) {

        try {
            ProcessBuilder procBldr = new ProcessBuilder("notepad", "testfile");
            Process p = procBldr.start();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException exc) {
                System.out.println("Sleep interrupted\n" + exc);
            }
            // encerra o processo.
            p.destroy();
        } catch (IOException exc) {
            System.out.println("Error executing notepad.\n" + exc);
        }
    }
}
