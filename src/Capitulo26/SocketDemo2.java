package Capitulo26;

// Demonstra Sockets.

import java.net.*;
import java.io.*;

class SocketDemo2 {

    // Usa o gerenciamento automático de recursos para fechar um soquete.
    public static void main(String[] args) {
        int ch;

        // Cria um soquete conectado a internic.net, porta 43.
        // Gerencia esse soquete com um bloco try-with-resources.
        try ( Socket socket = new Socket("whois.internic.net", 43) ) {

            // Obtém os fluxos de entrada e saída.
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
            while ((ch = in.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch(IOException exc) {
            System.out.println(exc);
        }
        // Agora o soquete é fechado.
    }
}
