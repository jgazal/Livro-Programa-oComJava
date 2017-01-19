package Capitulo17;

/* Exercício 10
 Uma versão do cronômetro da seção Tente isto 17-1 que usa um único botão de ação*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

class StopWatch2 implements ActionListener {
    JLabel jlab;
    long start; // contém a hora inicial em milissegundos
    JButton jbtnStartStop; // um botão que inicia ou interrompe

    StopWatch2() {
        // Cria um contêiner JFrame.
        JFrame jfrm = new JFrame("A Simple Stopwatch");

        // Especifica FlowLayout como gerenciador de leiaute.
        jfrm.setLayout(new FlowLayout());

        // Fornece um tamanho inicial para o quadro.
        jfrm.setSize(250, 90);

        // Encerra o programa quando o usuário fecha o aplicativo.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria um botão.
        jbtnStartStop = new JButton("Start");

        // Adiciona ouvintes de ação.
        jbtnStartStop.addActionListener(this);

        // Adiciona os botões ao painel de conteúdo.
        jfrm.add(jbtnStartStop);

        // Cria um rótulo baseado em texto.
        jlab = new JLabel("Press Start to begin timing.");

        // Adiciona o rótulo ao quadro.
        jfrm.add(jlab);

        // Exibe o quadro.
        jfrm.setVisible(true);
    }
    // Trata eventos de botão.
    public void actionPerformed(ActionEvent ae) {

        // obtém a hora atual do sistema
        Calendar cal = Calendar.getInstance();
        if(ae.getActionCommand().equals("Start")) {

            // Armazena a hora inicial.
            start = cal.getTimeInMillis();
            jlab.setText("Stopwatch is Running...");
            jbtnStartStop.setText("Stop");
        }
        else {
            // Calcula o tempo decorrido.
            jlab.setText("Elapsed time is " + (double) (cal.getTimeInMillis() - start)/1000);
            jbtnStartStop.setText("Start");
        }
    }
    public static void main(String[] args) {
        // Cria o quadro na thread de despacho de evento.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new StopWatch2();
            }
        });
    }
}