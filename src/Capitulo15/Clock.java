package Capitulo15;

/*Exercício 4.
  Applet de relógio simples.*/
import java.util.*;
import java.awt.*;
import java.applet.*;
/*
<object code="Clock" width=200 height=50>
</object>
*/
public class Clock extends Applet implements Runnable {
    String msg;
    Thread t;
    Calendar clock;
    boolean stopFlag;
    // Inicializa
    public void init() {
        t = null;
        msg = "";
    }
    // Inicia a thread quando o applet é necessário.
    public void start() {
        t = new Thread(this);
        stopFlag = false;
        t.start();
    }
    // Ponto de entrada do relógio.
    public void run() {
// Solicita uma atualização a cada segundo.
        for( ; ; ) {
            try {
                repaint();
                Thread.sleep(1000);
                if(stopFlag) break;
            } catch(InterruptedException exc) {}
        }
    }
    // Pausa o relógio.
    public void stop() {
        stopFlag = true;
        t = null;
    }
    // Exibe o relógio.
    public void paint(Graphics g) {
        clock = Calendar.getInstance();
        msg = "Current time is " + Integer.toString(clock.get(Calendar.HOUR));
        msg = msg + ":" + Integer.toString(clock.get(Calendar.MINUTE));
        msg = msg + ":" + Integer.toString(clock.get(Calendar.SECOND));
        g.drawString(msg, 30, 30);
    }
}
