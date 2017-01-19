package Capitulo11;

//Grava e depois lê dados binários

import java.io.*;

class RWData {
    public static void main(String[] args){
        int i = 10;
        double d = 1023.56;
        boolean b = true;

        //Grava alguns valores
        try (DataOutputStream dataOut =
                     new DataOutputStream(new FileOutputStream("testdata"))) {
            System.out.println("Writing " + i);
            dataOut.writeInt(i);                //grava dados binários

            System.out.println("Writing " + d);
            dataOut.writeDouble(d);             //grava dados binários

            System.out.println("Writing " + b);
            dataOut.writeBoolean(b);            //grava dados binários

            System.out.println("Writing " + 12.2 * 7.4);
            dataOut.writeDouble(12.2 * 7.4);    //grava dados binários
        }
        catch(IOException exc) {
            System.out.println("Write error.");
            return;
        }

        System.out.println();

        //Agora, os lê
        try (DataInputStream dataIn =
                     new DataInputStream(new FileInputStream("testdata"))) {
            i = dataIn.readInt();           //lê dados binários
            System.out.println("Reading " + i);

            d = dataIn.readDouble();        //lê dados binários
            System.out.println("Reading " + d);

            b = dataIn.readBoolean();       //lê dados binários
            System.out.println("Reading " + b);

            d = dataIn.readDouble();        //lê dados binários
            System.out.println("Reading " + d);
        }
        catch(IOException exc) {
            System.out.println("Read error.");
        }
    }
}

