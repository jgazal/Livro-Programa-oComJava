package Capitulo11;

//Demonstra PrintWriter.
import java.io.*;

public class PrintWriterDemo {

    public static void main(String[] args) {

        PrintWriter pw = new PrintWriter(System.out, true); //cria um PrintWriter vinculado a System.out
        int i = 10;
        double d = 123.65;

        pw.println("Using a PrintWriter.");
        pw.println(i);
        pw.println(d);

        pw.println(i + " + " + d + " is " + (i+d));
    }
}
