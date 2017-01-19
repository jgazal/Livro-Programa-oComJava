package Capitulo26;

// Demonstra os datagramas – lado do cliente.

import java.net.*;
import java.io.*;

class DGClient {

    // Essa porta foi escolhida arbitrariamente.
    // Você deve empregar uma porta não usada em sua máquina.
    public static int clientPort = 50000;
    public static int buffer_size = 1024;

    public static DatagramSocket ds;

    public static void dgClient() throws IOException {
        String str;
        byte[] buffer = new byte[buffer_size];

        System.out.println("Receiving Data");

        for(;;) {
            // cria um novo pacote para receber os dados
            DatagramPacket p = new DatagramPacket(buffer, buffer.length);

            // espera um pacote
            ds.receive(p);  //Recebe um pacote

            // converte buffer em String
            str = new String(p.getData(), 0, p.getLength());

            // exibe o string no cliente
            System.out.println(str);

            // encerra quando "stop" é recebida.
            if(str.equals("stop")) {
                System.out.println("Client Stopping.");
                break;
            }
        }
    }
    public static void main(String[] args) {
        ds = null;
        try {
            ds = new DatagramSocket(clientPort);
            dgClient();
        } catch(IOException exc) {
            System.out.println("Communication error: " + exc);
        } finally {
            if(ds != null) ds.close();
        }
    }
}
