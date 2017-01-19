package Capitulo27;

// Um exemplo de CyclicBarrier.

import java.util.concurrent.*;

class BarDemo {
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(3, new BarAction() );
        System.out.println("Starting");
        new MyThread2(cb, "A");
        new MyThread2(cb, "B");
        new MyThread2(cb, "C");
    }

    // Alterando o método main como mostrado abaixo, a saída será diferente
/*    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(3, new BarAction() );
        System.out.println("Starting");
        new MyThread2(cb, "A");
        new MyThread2(cb, "B");
        new MyThread2(cb, "C");
        new MyThread2(cb, "X");
        new MyThread2(cb, "Y");
        new MyThread2(cb, "Z");
    }*/
}
// Uma thread de execução que usa um CyclicBarrier.
class MyThread2 implements Runnable {
    CyclicBarrier cbar;
    String name;
    MyThread2(CyclicBarrier c, String n) {
        cbar = c;
        name = n;
        new Thread(this).start();
    }
    public void run() {
        System.out.println(name);
        try {
            cbar.await();
        } catch (BrokenBarrierException exc) {
            System.out.println(exc);
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }
    }
}
// Um objeto dessa classe é chamado quando o CyclicBarrier termina.
class BarAction implements Runnable {
    public void run() {
        System.out.println("Barrier Reached!");
    }
}
