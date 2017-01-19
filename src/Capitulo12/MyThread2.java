package Capitulo12;

//MyThread melhorada

class MyThread2 implements Runnable {
    Thread thrd;

    //Constrói uma nova thread
    MyThread2(String name) {
        thrd = new Thread(this, name);      //A thread é nomeada quando é criada
        thrd.start();                       //Começa a executar a thread
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

class UseThreadsImproved {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        MyThread2 mt = new MyThread2("Child #1"); //Agora a thread começa quando é criada

        for(int i=0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch(InterruptedException exc) {
                System.out.println("Main thread interrupted.");
            }
        }

        System.out.println("Main thread ending.");
    }
}
