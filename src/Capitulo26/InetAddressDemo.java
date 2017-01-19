package Capitulo26;

// Demonstra InetAddress.

import java.net.*;

class InetAddressDemo {
    public static void main(String[] args) {

        try {
            InetAddress address = InetAddress.getByName("www.mcgraw-hill.com");
            System.out.println("Host name: " + address.getHostName());
            System.out.println("Address: " + address.getHostAddress());

            System.out.println();

            address = InetAddress.getByName("www.mhhe.com");
            System.out.println("Host name: " + address.getHostName());
            System.out.println("Address: " + address.getHostAddress());

            System.out.println();

            address = InetAddress.getByName("www.mheducation.com");
            System.out.println("Host name: " + address.getHostName());
            System.out.println("Address: " + address.getHostAddress());
        } catch (UnknownHostException exc) {
            System.out.println(exc);
        }
    }
}
