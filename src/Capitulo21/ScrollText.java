package Capitulo21;

// Tente isto 21-1: Um applet baseado no Swing que rola texto em um rótulo.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/* Esta HTML pode ser usada para iniciar o applet:
<object code="ScrollText" width=240 height=100>
</object> */

public class ScrollText extends JApplet {
    JLabel jlab;
    String msg = " Swing makes the GUI move! ";
    ActionListener scroller;
    Timer stTimer; // este temporizador controla a velocidade da rolagem

    // Inicializa o applet.
    public void init() {
        try {
            SwingUtilities.invokeAndWait(new Runnable () {
                public void run() {
                    guiInit();
                }
            });
        } catch(Exception exc) {
            System.out.println("Can’t create because of " + exc);
        }
    }
    // Inicia o temporizador quando o applet é iniciado.
    public void start() {
        stTimer.start();
    }
    // Interrompe o temporizador quando o applet é encerrado.
    public void stop() {
        stTimer.stop();
    }
    // Interrompe o temporizador quando o applet é destruído.
    public void destroy() {
        stTimer.stop();
    }
    // Inicializa a GUI do temporizador.
    private void guiInit() {

        // Cria o rótulo que rolará a mensagem.
        jlab = new JLabel(msg);
        jlab.setHorizontalAlignment(SwingConstants.CENTER);

        // Cria o ouvinte de ação para o temporizador.
        scroller = new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                // Rola a mensagem um caractere para a esquerda.
                char ch = msg.charAt(0);
                msg = msg.substring(1, msg.length());
                msg += ch;
                jlab.setText(msg);
            }
        };
        // Cria o temporizador.
        stTimer = new Timer(200, scroller);

        // Adiciona o rótulo ao painel de conteúdo do applet.
        add(jlab);
    }
}
