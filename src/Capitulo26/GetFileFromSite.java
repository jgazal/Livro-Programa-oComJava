package Capitulo26;

// Tente Isto 26-1

import java.net.*;
import java.io.*;

class GetFileFromSite {
    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("Usage: java GetFileFromSite url file");
            return;
        }
        InputStream in = null;
        URLConnection connection = null;
        FileOutputStream fout = null;

        try {
            URL url = new URL(args[0]);
            connection = url.openConnection();
            in = connection.getInputStream();
            fout = new FileOutputStream(args[1]);

            // Baixa e salva o arquivo.
            int b;
            while (((b = in.read()) != -1)) {
                fout.write(b);
            }
        } catch (IOException exc) {
            System.out.println("Connection Error: " + exc);
        } finally {
            try {
                if(in != null) in.close();
                if(fout != null) fout.close();
            } catch (IOException exc) {
                System.out.println("Error closing stream: " + exc);
            }
        }
    }
}