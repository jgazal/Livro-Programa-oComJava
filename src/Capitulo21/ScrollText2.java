package Capitulo21;

// Exercício 9

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/* Esta HTML pode ser usada para iniciar o applet:
<object code="ScrollText" width=240 height=100>
</object> */

public class ScrollText2 extends JApplet {
    JLabel jlab;
    String msg = " Swing makes the GUI move! ";
    ActionListener scroller;
    Timer stTimer; // Este timer controla a velocidade da rolagem.
    int counter; // usa para inverter a rolagem.

    // Este valor controla quando a direção da rolagem deve mudar.
    int scrollLimit;

    // Inicializa o applet.
    public void init() {
        counter = 0;
        scrollLimit = 100;
        try {
            SwingUtilities.invokeAndWait(new Runnable () {
                public void run() {
                    guiInit();
                }
            });
        } catch(Exception exc) {
            System.out.println("Can't create because of " + exc);
        }
    }
    // Inicia o timer quando o applet é iniciado.
    public void start() {
        stTimer.start();
    }
    // Interrompe o timer quando o applet é interrompido.
    public void stop() {
        stTimer.stop();
    }
    // Interrompe o timer quando o applet é destruído.
    public void destroy() {
        stTimer.stop();
    }
    // Inicializa a GUI do timer.
    private void guiInit() {

        // Cria o rótulo que rolará a mensagem.
        jlab = new JLabel(msg);
        jlab.setHorizontalAlignment(SwingConstants.CENTER);

        // Cria o ouvinte de ação para o timer. Esta versão inverte a direção da rolagem a cada 20 segundos.
        scroller = new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if(counter < scrollLimit) {

                    // Rola a mensagem um caractere para a esquerda.
                    char ch = msg.charAt(0);
                    msg = msg.substring(1, msg.length());
                    msg += ch;
                } else {

                    // Rola a mensagem um caractere para a direita.
                    char ch = msg.charAt(msg.length()-1);
                    msg = msg.substring(0, msg.length()-1);
                    msg = ch + msg;
                    if(counter == scrollLimit*2) counter = 0;
                }
                counter++;
                jlab.setText(msg);
            }
        };

        // Cria o timer.
        stTimer = new Timer(200, scroller);

        // Adiciona o rótulo ao painel de conteúdo do applet.
        getContentPane().add(jlab);
    }
}
