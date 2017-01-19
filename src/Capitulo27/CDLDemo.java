package Capitulo27;

// Um exemplo de CountDownLatch.

import java.util.concurrent.CountDownLatch;

class CDLDemo {
    public static void main(String[] args) {
        CountDownLatch cdl = new CountDownLatch(5); //Cria um CountDownLatch que espera 5 eventos.

        System.out.println("Starting");

        new MyThread(cdl);

        try {
            cdl.await();    //Espera até a contagem regressiva terminar.
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }
        System.out.println("Done");
    }
}
class MyThread implements Runnable {
    CountDownLatch latch;

    MyThread(CountDownLatch c) {
        latch = c;
        new Thread(this).start();
    }
    public void run() {
        for(int i = 0; i<5; i++) {
            System.out.println(i);
            latch.countDown(); // decrementa a contagem a cada passagem pelo laço
        }
    }
}

