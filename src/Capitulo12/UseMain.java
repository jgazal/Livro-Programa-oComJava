package Capitulo12;

//Controlando a thread principal

class UseMain {
    public static void main(String[] args) {
        Thread thrd;

        //Acessa a thread princiapl
        thrd = Thread.currentThread();

        //Exibe o nome da thread principal
        System.out.println("Main thread is called: " + thrd.getName());

        //Exibe a prioridade da thread principal
        System.out.println("Priority: " + thrd.getPriority());

        System.out.println();

        //Define o nome
        System.out.println("Setting name.\n");
        thrd.setName("Thread #1");

        System.out.println("Main thread is now called: " + thrd.getName());
    }
}
