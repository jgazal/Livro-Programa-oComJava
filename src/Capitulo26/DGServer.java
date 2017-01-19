package Capitulo26;

// Demonstra os datagramas – lado do servidor.

import java.net.*;
import java.io.*;

class DGServer {

    // Essas portas foram escolhidas arbitrariamente.
    // Você deve empregar portas não usadas em sua máquina.
public static int clientPort = 50000;
    public static int serverPort = 50001;

    public static DatagramSocket ds;

    public static void dgServer() throws IOException {
        byte[] buffer;
        String str;

        BufferedReader conin = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("Enter characters. Enter 'stop' to quit.");

        for(;;) {
            // lê um string a partir do teclado
            str = conin.readLine();

            // converte o string em um array de bytes para transmissão
            buffer = str.getBytes();

            // envia um novo pacote contendo o string
            ds.send(new DatagramPacket(buffer, buffer.length,   //Envia um pacote.
                    InetAddress.getLocalHost(), clientPort));

            // encerra quando "stop" é inserida
            if(str.equals("stop")) {
                System.out.println("Server Quits.");
                return;
            }
        }
    }
    public static void main(String[] args) {
        ds = null;

        try {
            ds = new DatagramSocket(serverPort);
            dgServer();
        } catch(IOException exc) {
            System.out.println("Communication error: " + exc);
        } finally {
            if(ds != null) ds.close();
        }
    }
}
