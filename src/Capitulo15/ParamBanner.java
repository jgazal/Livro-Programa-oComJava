package Capitulo15;

/*Exercício 3
  Applet de banner simples que usa parâmetros.*/
import java.awt.*;
import java.applet.*;
/*
<applet code="ParamBanner" width=300 height=50>
<param name=message value=" I like Java! ">
<param name=delay value=500>
</applet>
*/
public class ParamBanner extends Applet implements Runnable {
    String msg;
    int delay;
    Thread t;
    boolean stopFlag;
    // Inicializa t com null.
    public void init() {
        String temp;
        msg = getParameter("message");
        if(msg == null) msg = " Java Rules the Web ";
        temp = getParameter("delay");
        try {
            if(temp != null)
                delay = Integer.parseInt(temp);
            else
                delay = 250; // usa o padrão quando não especificado
        } catch(NumberFormatException exc) {
            delay = 250 ; // usa o padrão em caso de erro
        }
        t = null;
    }
    // Inicia a thread quando o applet é necessário.
    public void start() {
        t = new Thread(this);
        stopFlag = false;
        t.start();
    }
    // Ponto de entrada da thread que executa o banner.
    public void run() {
// Solicita uma atualização no intervalo especificado.
        for( ; ; ) {
            try {
                repaint();
                Thread.sleep(delay);
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
