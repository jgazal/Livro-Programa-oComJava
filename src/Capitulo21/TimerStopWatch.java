package Capitulo21;

// Esta versão do cronômetro usa a classe Timer.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Calendar;

class TimerStopWatch {
    JLabel jlab; // exibe o tempo decorrido
    JButton jbtnStart; // inicia o cronômetro
    JButton jbtnStop; // interrompe o cronômetro
    long start; // contém a hora inicial em milissegundos
    Timer swTimer; // o timer do cronômetro. Usa um Timer para atualizar a exibição da hora.

    TimerStopWatch() {
        // Cria um contêiner JFrame.
        JFrame jfrm = new JFrame("Timer-based Stopwatch");

        // Especifica FlowLayout como gerenciador de leiaute.
        jfrm.setLayout(new FlowLayout());

        // Fornece um tamanho inicial para o quadro.
        jfrm.setSize(230, 90);

        // Encerra o programa quando o usuário fecha o aplicativo.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria o rótulo de tempo decorrido.
        jlab = new JLabel("Press Start to begin timing.");

        // Cria os botões Start e Stop.
        jbtnStart = new JButton("Start");
        jbtnStop = new JButton("Stop");
        jbtnStop.setEnabled(false);

        // Este ouvinte de ação é chamado quando o timer expira.
        ActionListener timerAL = new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                updateTime();
            }
        };
        // Cria um timer que expira a cada décimo de segundo.
        swTimer = new Timer(100, timerAL); //timerAL é especificado para tratar os eventos de ação gerados pelo timer.

        // Adiciona os ouvintes de ação para os botões Start e Stop.
        jbtnStart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                // Armazena a hora inicial.
                start = Calendar.getInstance().getTimeInMillis();

                // Inverte o estado dos botões.
                jbtnStop.setEnabled(true);
                jbtnStart.setEnabled(false);

                // Inicia o cronômetro.
                swTimer.start();
            }
        });
        jbtnStop.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                long stop = Calendar.getInstance().getTimeInMillis();

                // Calcula o tempo decorrido.
                jlab.setText("Elapsed time is "
                        + (double) (stop - start)/1000);

                // Inverte o estado dos botões.
                jbtnStart.setEnabled(true);
                jbtnStop.setEnabled(false);

                // Interrompe o cronômetro.
                swTimer.stop();
            }
        });
        // Adiciona os botões e o rótulo ao painel de conteúdo.
        jfrm.add(jbtnStart);
        jfrm.add(jbtnStop);
        jfrm.add(jlab);

        // Exibe o quadro.
        jfrm.setVisible(true);
    }
    // Atualiza a exibição do tempo decorrido. Observe que a variável running não é mais necessária.
    void updateTime() {
        long temp = Calendar.getInstance().getTimeInMillis();
        jlab.setText("Elapsed time is " +
                (double) (temp - start)/1000);
    }
    public static void main(String[] args) {
        // Cria o quadro na thread de despacho de evento.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TimerStopWatch();
            }
        });
    }
}
