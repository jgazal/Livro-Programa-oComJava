package Capitulo27;

// Um exemplo de semáforo simples.

import java.util.concurrent.*;

class SemDemo {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(1);   //Cria um semáforo que só tem 1 permissão.

        new IncThread(sem, "A");
        new DecThread(sem, "B");
    }
}
// Um recurso compartilhado.
class Shared {
    static int count = 0;
}
// Uma thread de execução que incrementa count.
class IncThread implements Runnable {
    String name;
    Semaphore sem;

    IncThread(Semaphore s, String n) {
        sem = s;
        name = n;
        new Thread(this).start();
    }
    public void run() {
        System.out.println("Starting " + name);

        try {
            // Primeiro, obtém uma permissão.
            System.out.println(name + " is waiting for a permit.");
            sem.acquire();  //Espera até uma permissão poder ser adquirida.
            System.out.println(name + " gets a permit.");

            // Agora, acessa o recurso compartilhado.
            for(int i=0; i < 5; i++) {
                Shared.count++;
                System.out.println(name + ": " + Shared.count);

                // Permite uma mudança de contexto -- se possível.
                Thread.sleep(10);
            }
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }
        // Libera a permissão.
        System.out.println(name + " releases the permit.");
        sem.release();
    }
}
// Uma thread de execução que decrementa count.
class DecThread implements Runnable {
    String name;
    Semaphore sem;
    DecThread(Semaphore s, String n) {
        sem = s;
        name = n;
        new Thread(this).start();
    }
    public void run() {
        System.out.println("Starting " + name);
        try {
            // Primeiro, obtém uma permissão.
            System.out.println(name + " is waiting for a permit.");
            sem.acquire();  //Espera até uma permissão poder ser adquirida.
            System.out.println(name + " gets a permit.");

            // Agora, acessa o recurso compartilhado.
            for(int i=0; i < 5; i++) {
                Shared.count--;
                System.out.println(name + ": " + Shared.count);

                // Permite uma mudança de contexto -- se possível.
                Thread.sleep(10);
            }
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }
        // Libera a permissão.
        System.out.println(name + " releases the permit.");
        sem.release();
    }
}
