package Capitulo27;

// Um exemplo de Phaser.

import java.util.concurrent.*;

class PhaserDemo {
    public static void main(String[] args) {
        Phaser phsr = new Phaser(1);    //Cria um Phaser com um participante inicial para a thread principal.
        int curPhase;

        System.out.println("Starting");

        new MyThread3(phsr, "A");
        new MyThread3(phsr, "B");
        new MyThread3(phsr, "C");

        // Espera todas as threads terminarem a fase um.
        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Phase " + curPhase + " Complete");

        // Espera todos as threads terminarem a fase dois.
        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Phase " + curPhase + " Complete");

        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Phase " + curPhase + " Complete");

        // Anula o registro da thread principal.
        phsr.arriveAndDeregister();

        if(phsr.isTerminated())
            System.out.println("The Phaser is terminated");
    }
}
// Uma thread de execução que usa um Phaser.
class MyThread3 implements Runnable {
    Phaser phsr;
    String name;

    MyThread3(Phaser p, String n) {
        phsr = p;
        name = n;
        phsr.register();    //Registra essa thread.
        new Thread(this).start();
    }
    public void run() {
        System.out.println("Thread " + name + " Beginning Phase One");
        phsr.arriveAndAwaitAdvance(); // Sinaliza a chegada.

        // Faz uma pausa para evitar uma saída confusa.
        // Isso é feito apenas a título de ilustração. Não é necessário para a operação apropriada do phaser.
        try {
            Thread.sleep(10);
        } catch(InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Thread " + name + " Beginning Phase Two");
        phsr.arriveAndAwaitAdvance(); // Sinaliza a chegada.

        // Faz uma pausa para evitar uma saída confusa.
        // Isso é feito apenas a título de ilustração. Não é necessário para a operação apropriada do phaser.
        try {
            Thread.sleep(10);
        } catch(InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Thread " + name + " Beginning Phase Three");
        phsr.arriveAndDeregister(); // Sinaliza a chegada e anula o registro ao terminar.
    }
}
