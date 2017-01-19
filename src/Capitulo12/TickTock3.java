package Capitulo12;

/*Exercício 8.
Faz a classe TickTock marcar realmente o tempo.*/

class TickTock3 {

    String state; //contém o estado do relógio

    synchronized void tick(boolean running) {
        if(!running) { //interrompe o relógio
            state = "ticked";
            notify(); //notifica as threads que estiverem esperando
            return;
        }

        System.out.print("Tick ");

        //espera 1/2 segundo
        try {
            Thread.sleep(500);
        } catch(InterruptedException exc) {
            System.out.println("Thread interrupted.");
        }

        state = "ticked"; //configura o estado atual com ticked

        notify(); //deixa tock() ser executado
        try {
            while(!state.equals("tocked"))
                wait(); //espera tock() terminar
        }
        catch(InterruptedException exc) {
            System.out.println("Thread interrupted.");
        }
    }

    synchronized void tock(boolean running) {
        if(!running) { //interrompe o relógio
            state = "tocked";
            notify(); //notifica as threads que estiverem esperando
            return;
        }

        System.out.println("Tock");

        //espera 1/2 segundo
        try {
            Thread.sleep(500);
        } catch(InterruptedException exc) {
            System.out.println("Thread interrupted.");
        }

        state = "tocked"; //configura o estado atual com tocked

        notify(); //deixa tick() ser executado
        try {
            while(!state.equals("ticked"))
                wait(); //espera tick() terminar
        }
        catch(InterruptedException exc) {
            System.out.println("Thread interrupted.");
        }
    }
}


