package Capitulo26;

// Demonstra URLConnection.

import java.net.*;
import java.io.*;
import java.util.*;

class UCDemo {
    public static void main(String[] args) {

        InputStream in = null;
        URLConnection connection = null;

        try {
            URL url = new URL("http://www.mcgraw-hill.com");
            connection = url.openConnection();  //Abre uma conexão.

            // obtém a data
            long d = connection.getDate();
            if(d==0)
                System.out.println("No date information.");
            else
                System.out.println("Date: " + new Date(d));

            // obtém o tipo do conteúdo
            System.out.println("Content-Type: " +
                    connection.getContentType());

            // obtém a data de expiração
            d = connection.getExpiration();
            if(d==0)
                System.out.println("No expiration information.");
            else
                System.out.println("Expires: " + new Date(d));

            // obtém a data da última modificação
            d = connection.getLastModified();
            if(d==0)
                System.out.println("No last-modified information.");
            else
                System.out.println("Last-Modified: " + new Date(d));

            // obtém o tamanho do conteúdo
            long len = connection.getContentLengthLong();
            if(len == -1)
                System.out.println("Content length unavailable.");
            else
                System.out.println("Content-Length: " + len);

            if(len != 0) {
                System.out.println("=== Content ===");
                in = connection.getInputStream();   //Obtém o fluxo de entrada.

                int ch;
                while (((ch = in.read()) != -1)) {  //Lê e exibe o conteúdo.
                    System.out.print((char) ch);
                }
            } else {
                System.out.println("No content available.");
            }
        } catch(IOException exc) {
            System.out.println("Connection Error: " + exc);
        } finally {
            try {
                if(in != null) in.close();
            } catch(IOException exc) {
                System.out.println("Error closing connection: " + exc);
            }
        }
    }
}
