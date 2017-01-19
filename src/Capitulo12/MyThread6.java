package Capitulo12;

//Suspendendo, retomando e encerrando uma thread

class MyThread9 implements Runnable {
    Thread thrd;

    boolean suspended;  //suspende a thread quando igual a true
    boolean stopped;    //encerra a thread quando igual a true

    MyThread9 (String name) {
        thrd = new Thread(this, name);
        suspended = false;
        stopped = false;
        thrd.start();
    }

    //Este é o ponto de entrada da thread
    public void run() {
        System.out.println(thrd.getName() + " starting.");
        try {
            for(int i = 1; i < 1000; i++) {
                System.out.print(i + " ");
                if((i%10)==0) {
                    System.out.println();
                    Thread.sleep(250);
                }

                //Usa um bloco sincronizado para verificar suspended e stopped
                synchronized(this) {    //Este bloco sincronizado verifica suspended e stopped
                    while(suspended) {
                        wait();
                    }
                    if(stopped) break;
                }
            }
        } catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " interrupted.");
        }
        System.out.println(thrd.getName() + " exiting.");
    }

    //Encerra a thread
    synchronized void myStop() {
        stopped = true;

        //O código a seguir assegura que uma thread suspensa possa ser encerrada
        suspended = false;
        notify();
    }

    //Suspende a thread
    synchronized void mySuspend() {
        suspended = true;
    }

    //Retoma a thread
    synchronized void myResume() {
        suspended = false;
        notify();
    }
}

class Suspend {
    public static void main(String[] args) {
        MyThread9 ob1 = new MyThread9("My Thread");

        try {
            Thread.sleep(1000); //permite que a thread ob1 comece a ser executada

            ob1.mySuspend();
            System.out.println("Suspending thread.");
            Thread.sleep(1000);

            ob1.myResume();
            System.out.println("Resuming thread.");
            Thread.sleep(1000);

            ob1.mySuspend();
            System.out.println("Suspending thread.");
            Thread.sleep(1000);

            ob1.myResume();
            System.out.println("Resuming thread.");
            Thread.sleep(1000);

            ob1.mySuspend();
            System.out.println("Stopping thread.");
            ob1.myStop();
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }

        //espera a thread terminar
        try {
            ob1.thrd.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }

        System.out.println("Main thread exiting.");
    }
}

