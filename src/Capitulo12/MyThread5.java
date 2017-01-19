package Capitulo12;

//Usa join().

class MyThread5 implements Runnable {
    Thread thrd;

    //Constrói uma nova thread
    MyThread5(String name) {
        thrd = new Thread(this, name);
        thrd.start(); //inicia a thread
    }

    //Começa a execução da nova thread
    public void run() {
        System.out.println(thrd.getName() + " starting.");
        try {
            for(int count=0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + thrd.getName() + ", count is " + count);
            }
        }
        catch(InterruptedException exc) {
            System.out.println(thrd.getName() + " interrupted.");
        }
        System.out.println(thrd.getName() + " terminating.");
    }
}

class JoinThreads {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        MyThread5 mt1 = new MyThread5("Child #1");
        MyThread5 mt2 = new MyThread5("Child #2");
        MyThread5 mt3 = new MyThread5("Child #3");

        try {
            mt1.thrd.join();    //Espera até a thread especificada terminar
            System.out.println("Child #1 joined.");
            mt2.thrd.join();    //Espera até a thread especificada terminar
            System.out.println("Child #2 joined.");
            mt3.thrd.join();    //Espera até a thread especificada terminar
            System.out.println("Child #3 joined.");
        }
        catch(InterruptedException exc) {
            System.out.println("Main thread interrupted. ");
        }
        System.out.println("Main thread ending.");
    }
}

