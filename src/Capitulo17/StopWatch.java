package Capitulo17;

// Tente isto 17-1: um cronômetro simples.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

class StopWatch implements ActionListener {
    JLabel jlab;
    long start; // contém a hora inicial em milissegundos

    StopWatch() {
        // Cria um contêiner JFrame.
        JFrame jfrm = new JFrame("A Simple Stopwatch");

        // Especifica FlowLayout como gerenciador de leiaute.
        jfrm.setLayout(new FlowLayout());

        // Fornece um tamanho inicial para o quadro.
        jfrm.setSize(230, 90);

        // Encerra o programa quando o usuário fecha o aplicativo.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria dois botões.
        JButton jbtnStart = new JButton("Start");
        JButton jbtnStop = new JButton("Stop");

        // Adiciona ouvintes de ação.
        jbtnStart.addActionListener(this);
        jbtnStop.addActionListener(this);

        // Adiciona os botões ao painel de conteúdo.
        jfrm.add(jbtnStart);
        jfrm.add(jbtnStop);

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
        }
        else
            // Calcula o tempo decorrido.
            jlab.setText("Elapsed time is "
                    + (double) (cal.getTimeInMillis() - start)/1000);
    }
    public static void main(String[] args) {
        // Cria o quadro na thread de despacho de evento.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new StopWatch();
            }
        });
    }
}

