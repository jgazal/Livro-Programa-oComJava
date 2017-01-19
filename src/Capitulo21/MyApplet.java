package Capitulo21;

// Um applet simples baseado no Swing

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/* Esta HTML pode ser usada para iniciar o applet:
<object code="MyApplet" width=240 height=100>
</object> */

public class MyApplet extends JApplet {
    JButton jbtnOne;
    JButton jbtnTwo;
    JLabel jlab;

    // Chamado primeiro.
    public void init() {
        try {
            SwingUtilities.invokeAndWait(new Runnable () {
                public void run() { //Um applet baseado no Swing deve criar sua GUI na thread de despacho de evento.
                    guiInit(); // inicializa a GUI.
                }
            });
        } catch(Exception exc) {
            System.out.println("Can’t create because of " + exc);
        }
    }
    // Configura e inicializa a GUI.
    private void guiInit() {

        // Configura o applet para usar o leiaute de fluxo.
        setLayout(new FlowLayout());

        // Cria dois botões e um rótulo.
        jbtnOne = new JButton("One");
        jbtnTwo = new JButton("Two");
        jlab = new JLabel("Press a button.");

        // Adiciona ouvintes de ação para os botões.
        jbtnOne.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent le) {
                jlab.setText("Button One pressed.");
            }
        });
        jbtnTwo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent le) {
                jlab.setText("Button Two pressed.");
            }
        });
        // Adiciona os componentes ao painel de conteúdo do applet.
        add(jbtnOne);
        add(jbtnTwo);
        add(jlab);
    }
}
