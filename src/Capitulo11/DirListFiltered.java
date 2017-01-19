package Capitulo11;

//Diretório de arquivos .java

import java.io.*;

class DirListFiltered {
    public static void main(String[] args) {
        FilenameFilter only = new FilterExt("java");
        String dirname = "/javafiles";
        File myDir = new File(dirname);


        if (myDir.isDirectory()) {
            System.out.println("Java source files in " + dirname);

            String[] s = myDir.list(only);

            for (int i=0; i < s.length; i++) {
                System.out.println(s[i]);
            }
        }
    }
}
