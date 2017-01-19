package Capitulo26;

// Demonstra Sockets.

import java.net.*;
import java.io.*;

class SocketDemo {
    public static void main(String[] args) {
        int ch;
        Socket socket = null;

        try {
            // Cria um soquete conectado a whois.internic.net, porta 43.
            socket = new Socket("whois.internic.net", 43);  //Constrói um Socket

            // Obtém os fluxos de entrada e saída do soquete.
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();

            // Constrói um string de solicitação.
            String str = (args.length == 0 ? "mcgraw-hill.com" :
                    args[0]) + "\n";

            // Converte em bytes.
            byte[] buf = str.getBytes();

            // Envia a solicitação.
            out.write(buf);

            // Lê e exibe a resposta.
            while ((ch = in.read()) != -1) {    //Obtém a resposta.
                System.out.print((char) ch);
            }
        } catch(IOException exc) {
            System.out.println(exc);
        } finally {
            try {
                if(socket != null) socket.close();
            } catch(IOException exc) {
                System.out.println("Error closing socket: " + exc);
            }
        }
    }
}
