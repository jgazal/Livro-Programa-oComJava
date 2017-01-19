package Capitulo24;

// Demonstra Observable e Observer.

import java.util.*;

// Esta é a primeira classe observadora.
class Watcher1 implements Observer {
    public void update(Observable obj, Object arg) {
        System.out.println("update() in Watcher1 called, count is " +
                ((Integer)arg).intValue());
    }
}

// Esta é a segunda classe observadora.
class Watcher2 implements Observer {
    public void update(Observable obj, Object arg) {
        System.out.println("update() in Watcher2 called, count is " +
                ((Integer)arg).intValue());

        // Soa o alarme quando termina
        if(((Integer)arg).intValue() == 0)
            System.out.print('\7');
    }
}

// Esta é a classe que está sendo observada.
class BeingWatched extends Observable {

    // Faz apenas a contagem regressiva até zero.
    // Cada contagem representa uma mudança sobre a qual os observadores são notificados.
    void counter(int count) {
        for( ; count >= 0; count--) {
            setChanged(); // define o estado como alterado.
            notifyObservers(count); // notifica observadores
            try {
                Thread.sleep(200);
            } catch(InterruptedException e) {
                System.out.println("Sleep interrupted");
            }
        }
    }
}

class TwoObservers {
    public static void main(String[] args) {

        BeingWatched observed = new BeingWatched(); //Cria um objeto observado

        //Cria dois observadores
        Watcher1 observing1 = new Watcher1();
        Watcher2 observing2 = new Watcher2();

        // adiciona os dois observadores ao objeto observado
        observed.addObserver(observing1); //Adiciona os objetos observadores para que eles
        observed.addObserver(observing2); //possam receber notificações de mudança.

        observed.counter(5);
    }
}
