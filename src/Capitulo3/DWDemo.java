package Capitulo3;

class DWDemo {

    public static void main(String[] args) throws java.io.IOException{
        char ch;

        do{
            System.out.print("Aperte uma tecla seguida de ENTER: ");
            ch = (char) System.in.read();
        }while(ch != 'q');
    }
}
