package Capitulo15;

/* Tente isto 15-1
   Applet de banner simples. Este applet cria uma thread que rola
   a mensagem contida em msg da direita para a esquerda ao longo de sua janela.
*/
import java.awt.*;
import java.applet.*;
/*
<applet code="Banner" width=300 height=50>
</applet>
*/
public class Banner extends Applet implements Runnable {
    String msg = " Java Rules the Web ";
    Thread t;
    boolean stopFlag;
    // Inicializa t com null.
    public void init() {
        t = null;
    }
    // Inicia a thread quando precisamos do applet.
    public void start() {
        t = new Thread(this);
        stopFlag = false;
        t.start();
    }
    // Ponto de entrada da thread que executa o banner.
    public void run() {
    // Solicita uma nova atualização a cada quarto de segundo.
        for( ; ; ) {
            try {
                repaint();
                Thread.sleep(250);
                if(stopFlag) break;
            } catch(InterruptedException exc) {}
        }
    }
    // Pausa o banner.
    public void stop() {
        stopFlag = true;
        t = null;
    }
    // Exibe o banner.
    public void paint(Graphics g) {
        char ch;
        ch = msg.charAt(0);
        msg = msg.substring(1, msg.length());
        msg += ch;
        g.drawString(msg, 50, 30);
    }
}
