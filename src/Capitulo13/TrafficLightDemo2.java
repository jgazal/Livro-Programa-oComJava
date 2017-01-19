package Capitulo13;

/*Exercício 4

Versão melhorada da simulação de semáforo que
armazena o retardo de sinal em TrafficLightColor*/

//Enumeração com as cores de um semáforo
enum TrafficLightColor2 {
    RED(12000), GREEN(10000), YELLOW(2000);

    private int delay;

    TrafficLightColor2(int d) {
        delay = d;
    }

    int getDelay() { return delay; }
}

//Semáforo computadorizado
class TrafficLightSimulator2 implements Runnable {
    private Thread thrd; //contém a thread que executa a simulação
    private TrafficLightColor2 tlc; //contém a cor atual
    boolean stop = false; //configura com true para interromper a simulação
    boolean changed = false; //true quando o sinal muda

    TrafficLightSimulator2(TrafficLightColor2 init) {
        tlc = init;

        thrd = new Thread(this);
        thrd.start();
    }

    TrafficLightSimulator2() {
        tlc = TrafficLightColor2.RED;

        thrd = new Thread(this);
        thrd.start();
    }

    //Inicia o semáforo
    public void run() {
        while(!stop) {
            //Esse código foi simplificado
            try {
                Thread.sleep(tlc.getDelay());
            } catch(InterruptedException exc) {
                System.out.println(exc);
            }

            changeColor();
        }
    }

    //Muda a cor
    synchronized void changeColor() {
        switch(tlc) {
            case RED:
                tlc = TrafficLightColor2.GREEN;
                break;
            case YELLOW:
                tlc = TrafficLightColor2.RED;
                break;
            case GREEN:
                tlc = TrafficLightColor2.YELLOW;
        }

        changed = true;
        notify(); //Sinaliza que a cor mudou
    }

    //Espera até uma mudança de sinal ocorrer
    synchronized void waitForChange() {
        try {
            while(!changed)
                wait(); //Espera o sinal mudar
            changed = false;
        } catch(InterruptedException exc) {
            System.out.println(exc);
        }
    }

    //Retorna a cor atual
    synchronized TrafficLightColor2 getColor() {
        return tlc;
    }

    //Interrompe o semáforo
    synchronized void cancel() {
        stop = true;
    }
}

class TrafficLightDemo2 {
    public static void main(String[] args) {
        TrafficLightSimulator2 tl = new TrafficLightSimulator2(TrafficLightColor2.GREEN);

        for(int i=0; i < 9; i++) {
            System.out.println(tl.getColor());
            tl.waitForChange();
        }

        tl.cancel();
    }
}

