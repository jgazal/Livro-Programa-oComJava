package Capitulo11;

//Usando diretórios

import java.io.*;

class DirList {
    public static void main(String[] args) {
        String dirname = "/javafiles";
        File myDir = new File(dirname);

        if (myDir.isDirectory()) {
            System.out.println("Directory of " + dirname);
            String[] s = myDir.list();

            for (int i=0; i < s.length; i++) {
                File f = new File(dirname + "/" + s[i]);
                if (f.isDirectory()) {
                    System.out.println(s[i] + " is a directory");
                } else {
                    System.out.println(s[i] + " is a file");
                }
            }
        } else {
            System.out.println(dirname + " is not a directory");
        }
    }
}
