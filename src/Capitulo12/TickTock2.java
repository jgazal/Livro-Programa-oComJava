package Capitulo12;

//Nenhuma chamada a wait() e notify()

class TickTock2 {

    String state; //contém o estado do relógio

    synchronized void tick(boolean running) {
        if(!running) { //interrompe o relógio
            state = "ticked";
            return;
        }

        System.out.print("Tick ");

        state = "ticked"; //define o estado atual com ticked
    }

    synchronized void tock(boolean running) {
        if(!running) { // stop the clock
            state = "tocked";
            return;
        }

        System.out.println("Tock");

        state = "tocked"; //define o estado atual com tocked
    }
}

