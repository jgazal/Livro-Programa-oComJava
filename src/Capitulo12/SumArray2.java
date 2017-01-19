package Capitulo12;

//Usa um bloco sincronizado para controla o acesso a sumArray

class SumArray2 {
    private int sum;

    int sumArray2(int[] nums) { //Aqui, sumArray() não é sincronizado
        sum = 0; //zera sum

        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
            System.out.println("Running total for " + Thread.currentThread().getName() + " is " + sum);
            try {
                Thread.sleep(10); //permite a alternância de tarefas
            }
            catch(InterruptedException exc) {
                System.out.println("Thread interrupted.");
            }
        }
        return sum;
    }
}

class MyThread7 implements Runnable {
    Thread thrd;
    static SumArray sa = new SumArray();
    int[] a;
    int answer;

    // Construct a new thread.
    MyThread7(String name, int[] nums) {
        thrd = new Thread(this, name);
        a = nums;
        thrd.start(); //inicia a thread
    }

    //Começa a execução da nova thread
    public void run() {
        System.out.println(thrd.getName() + " starting.");

        //sincroniza as chamadas a sumArray()
        synchronized(sa) {      //aqui, as chamadas a sumArray() em sa são sincronizadas
            answer = sa.sumArray(a);
        }
        System.out.println("Sum for " + thrd.getName() + " is " + answer);

        System.out.println(thrd.getName() + " terminating.");
    }
}

class Sync2 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        MyThread7 mt1 = new MyThread7("Child #1", a);
        MyThread7 mt2 = new MyThread7("Child #2", a);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch(InterruptedException exc) {
            System.out.println("Main Thread interrupted.");
        }
    }
}

