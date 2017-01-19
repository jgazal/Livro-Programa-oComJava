package Capitulo11;

//Obtém informações sobre um arquivo
import java.io.*;

class FileDemo {
    public static void main(String[] args) {
        File myFile = new File("/javafiles/MyClass.java");

        System.out.println("File Name: " + myFile.getName());
        System.out.println("Path: " + myFile.getPath());
        System.out.println("Abs Path: " + myFile.getAbsolutePath());
        System.out.println("Parent: " + myFile.getParent());
        System.out.println(myFile.exists() ? "exists" : "does not exist");
        System.out.println(myFile.isHidden() ? "is hidden" : "is not hidden");
        System.out.println(myFile.canWrite() ? "is writeable" : "is not writeable");
        System.out.println(myFile.canRead() ? "is readable" : "is not readable");
        System.out.println("is " + (myFile.isDirectory() ? "" : "not" + " a directory"));
        System.out.println(myFile.isFile() ? "is normal file" : "might be a named pipe");
        System.out.println(myFile.isAbsolute() ? "is absolute" : "is not absolute");
        System.out.println("File size: " + myFile.length() + " Bytes");
    }
}
