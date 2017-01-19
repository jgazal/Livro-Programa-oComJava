package Capitulo12;

//Usa wait() e notify() para simular um relógio funcionando

class TickTock {

    String state; //contém o estado do relógio

    synchronized void tick(boolean running) {
        if(!running) { //interrompe o relógio
            state = "ticked";
            notify(); //notifica qualquer thread que estiver esperando
            return;
        }

        System.out.print("Tick ");

        state = "ticked"; //define o estado atual com ticked

        notify(); //permite que tock() seja executado. tick() notifica tock()
        try {
            while(!state.equals("tocked"))
                wait(); //espera tock() terminar. tick() espera tock()
        }
        catch(InterruptedException exc) {
            System.out.println("Thread interrupted.");
        }
    }

    synchronized void tock(boolean running) {
        if(!running) { //interrompe o relógio
            state = "tocked";
            notify(); //notifica qualquer thread que estiver esperando
            return;
        }

        System.out.println("Tock");

        state = "tocked"; //define o estado atual com tocked

        notify(); //permite que tick() seja executado. tock() notifica ticK()
        try {
            while(!state.equals("ticked"))
                wait(); //espera tick() terminar. tock() espera tick()
        }
        catch(InterruptedException exc) {
            System.out.println("Thread interrupted.");
        }
    }
}

class MyThread8 implements Runnable {
    Thread thrd;
    TickTock ttOb;

    //Constrói uma nova thread
    MyThread8(String name, TickTock tt) {
        thrd = new Thread(this, name);
        ttOb = tt;
        thrd.start(); //inicia a thread
    }

    //Começa a execução da nova thread
    public void run() {

        if(thrd.getName().compareTo("Tick") == 0) {
            for(int i=0; i<5; i++) ttOb.tick(true);
            ttOb.tick(false);
        }
        else {
            for(int i=0; i<5; i++) ttOb.tock(true);
            ttOb.tock(false);
        }
    }
}

class ThreadCom {
    public static void main(String[] args) {
        TickTock tt = new TickTock();
        MyThread8 mt1 = new MyThread8("Tick", tt);
        MyThread8 mt2 = new MyThread8("Tock", tt);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch(InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
    }
}
