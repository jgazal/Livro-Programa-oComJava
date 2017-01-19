package Capitulo27;

// Um exemplo de bloqueio simples.

import java.util.concurrent.locks.*;

class LockDemo {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();   //Cria um bloqueio reentrante.

        new LockThread(lock, "A");
        new LockThread(lock, "B");
    }
}

// Um recurso compartilhado.
class Shared2 {
    static int count = 0;
}

// Uma thread de execução que incrementa count.
class LockThread implements Runnable {
    String name;
    ReentrantLock lock;

    LockThread(ReentrantLock lk, String n) {
        lock = lk;
        name = n;
        new Thread(this).start();
    }
    public void run() {
        System.out.println("Starting " + name);

        try {

            // Primeiro, bloqueia count.
            System.out.println(name + " is waiting to lock count.");
            lock.lock();    //Adquire o bloqueio.
            System.out.println(name + " is locking count.");

            Shared.count++; //Acessa o recurso
            System.out.println(name + ": " + Shared.count);

            // Agora, permite uma mudança de contexto -- se possível.
            System.out.println(name + " is sleeping.");
            Thread.sleep(1000);
        } catch (InterruptedException exc) {
            System.out.println(exc);
        } finally {

            // Desbloqueia
            System.out.println(name + " is unlocking count.");
            lock.unlock();  //Libera o bloqueio.
        }
    }
}