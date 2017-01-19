package Capitulo3;

import java.io.IOException;

class KbIn {

    public static void main(String[] args) throws IOException {

            char ch;

            System.out.print("Pressione uma tecla seguida de ENTER: ");

            ch = (char) System.in.read();   //Lê um caractere do teclado

            System.out.println("A tecla pressionada foi: " + ch);
        }
    }
