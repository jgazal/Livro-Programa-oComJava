package Capitulo27;

// Tente Isto 27-1

import java.util.concurrent.Phaser;

public class StarPhaserDemo {
    public static void main(String args[]) {
        Phaser phsr = new NewlinePhaser(4,3);

        new StarThread(phsr);
        new StarThread(phsr);
        new StarThread(phsr);
        new StarThread(phsr);
    }
}
class NewlinePhaser extends Phaser {
    int numPhases;

    public NewlinePhaser(int numParties, int phases) {
        super(numParties);
        numPhases = phases;
    }
    public boolean onAdvance(int phase, int numParties) {
        System.out.println(); // exibe uma nova linha
        return phase == numPhases-1; // para após numPhases
    }
}
class StarThread implements Runnable {
    Phaser phsr;

    StarThread(Phaser p) {
        phsr = p;
        new Thread(this).start();
    }
    public void run() {
        while (!phsr.isTerminated()) {
            System.out.print('*');
            phsr.arriveAndAwaitAdvance();
        }
    }
}
