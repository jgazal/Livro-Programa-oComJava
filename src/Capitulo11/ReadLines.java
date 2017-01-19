package Capitulo11;

//Lẽ um string no console usando um BufferedReader
import java.io.*;

class ReadLines {
    public static void main(String[] args) throws IOException {
        //Cria um BufferedReader usando System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        System.out.println("Enter lines of text.");
        System.out.println("Enter 'stop' to quit.");
        do {
            str = br.readLine();    //usa o método readLine() de BufferedReader para ler uma linha de texto
            System.out.println(str);
        } while(!str.equals("stop"));
    }
}
