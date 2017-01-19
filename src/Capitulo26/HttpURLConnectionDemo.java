package Capitulo26;

// Demonstra HttpURLConnection.

import java.net.*;
import java.io.*;
import java.util.*;

class HttpURLConnectionDemo {
    public static void main(String[] args) {

        try {
            URL url = new URL("http://www.mcgraw-hill.com");
            HttpURLConnection connection =
                    (HttpURLConnection) url.openConnection();

            // Exibe o método de solicitação.
            System.out.println("Request method is " +
                    connection.getRequestMethod());

            // Exibe o código de resposta.
            System.out.println("Response code is " +
                    connection.getResponseCode());

            // Exibe a mensagem de resposta.
            System.out.println("Response Message is " +
                    connection.getResponseMessage());

            // Obtém uma lista dos campos de cabeçalho e um conjunto das chaves de cabeçalho.
            Map<String, List<String>> hdrMap = connection.getHeaderFields();
            Set<String> hdrKeys = hdrMap.keySet();
            System.out.println("\nHere is the header:");

            // Exibe todas as chaves e valores de cabeçalho.
            for(String k : hdrKeys) {
                System.out.println("Key: " + k +
                        " Value: " + hdrMap.get(k));
            }
        } catch(IOException exc) {
            System.out.println(exc);
        }
    }
}
