package Capitulo27;

// Um exemplo de Exchanger.

import java.util.concurrent.Exchanger;

class ExgrDemo {
    public static void main(String[] args) {
        Exchanger<String> exgr = new Exchanger<String>();   //Cria um Exchanger para strings.

        new UseString(exgr);
        new MakeString(exgr);
    }
}
// Uma thread que constrói um string inicializado.
class MakeString implements Runnable {
    Exchanger<String> ex;
    String str;

    MakeString(Exchanger<String> c) {
        ex = c;
        str = new String();

        new Thread(this).start();
    }
    public void run() {
        char ch = 'A';

        for(int i = 0; i < 3; i++) {
            // Cria um string.
            for(int j = 0; j < 5; j++)
                str += ch++;

            try {
                // Troca um string inicializado por um vazio.
                str = ex.exchange(str);
            } catch(InterruptedException exc) {
                System.out.println(exc);
            }
        }
    }
}
// Uma thread que usa um string.
class UseString implements Runnable {
    Exchanger<String> ex;
    String str;
    UseString(Exchanger<String> c) {
        ex = c;
        new Thread(this).start();
    }
    public void run() {

        for(int i=0; i < 3; i++) {
            try {
                // Troca um string vazio por um inicializado.
                str = ex.exchange(new String());
                System.out.println("Got: " + str);
            } catch(InterruptedException exc) {
                System.out.println(exc);
            }
        }
    }
}

