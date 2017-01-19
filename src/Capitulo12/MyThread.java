package Capitulo12;

//Cria uma thread implementando Runnable

class MyThread implements Runnable {    //objetos de MyThread podem ser executados em suas
    String thrdName;                    //próprias threads, porque MyThread implementa Runnable

    MyThread(String name) {
        thrdName = name;
    }

    //Ponto de entrada da thread
    public void run() {             //Threads começam a ser executadas aqui
        System.out.println(thrdName + " starting.");
        try {
            for(int count=0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + thrdName + ", count is " + count);
            }
        }
        catch(InterruptedException exc) {
            System.out.println(thrdName + " interrupted.");
        }
        System.out.println(thrdName + " terminating.");
    }
}

class UseThreads {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        //Primeiro, constrói um objeto MyThread
        MyThread mt = new MyThread("Child #1"); //Cria um objeto executável

        //Em seguida, constrói uma thread a partir desse objeto
        Thread newThrd = new Thread(mt);

        //Para concluit, começa a execução da thread
        newThrd.start();

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
