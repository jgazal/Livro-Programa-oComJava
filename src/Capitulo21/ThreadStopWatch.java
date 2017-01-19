package Capitulo21;

// Uma versão melhorada da classe StopWatch da seção Tente isto 17-1.
// Esta versão usa uma thread separada para exibir o tempo decorrido quando o cronômetro está sendo executado.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Calendar;

class ThreadStopWatch {
    JLabel jlab; // exibe o tempo decorrido
    JButton jbtnStart; // inicia o cronômetro
    JButton jbtnStop; // interrompe o cronômetro
    long start; // contém a hora inicial em milissegundos
    boolean running=false; // verdadeiro quando o cronômetro está sendo executado.
    Thread thrd; // referência à thread de marcação do tempo.

    ThreadStopWatch() {
        // Cria um contêiner JFrame.
        JFrame jfrm = new JFrame("Thread-based Stopwatch");

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

        // Inicialmente desativa o botão Stop.
        jbtnStop.setEnabled(false);

        // Cria a instância de Runnable que será a segunda thread.
        Runnable myThread = new Runnable() {
            // Este método será executado em uma thread separada.
            public void run() {
                try {

                    // Relata o tempo decorrido a cada décimo de segundo.
                    for(; ; ) {

                        // Faz uma pausa por um décimo de segundo.
                        Thread.sleep(100);

                        // Chama updateTime() na thread de despacho de evento.
                        SwingUtilities.invokeLater(new Runnable() {
                            public void run() {
                                updateTime();
                            }
                        });
                    }
                } catch(InterruptedException exc) {
                    System.out.println("Call to sleep was interrupted.");
                    System.exit(1);
                }
            }
        };
        // Cria uma nova thread.
        thrd = new Thread(myThread);

        // Inicia a thread.
        thrd.start();

        // Adiciona os ouvintes de ação para os botões Start e Stop.
        jbtnStart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                // Armazena a hora inicial.
                start = Calendar.getInstance().getTimeInMillis();

                // Inverte o estado dos botões.
                jbtnStop.setEnabled(true);
                jbtnStart.setEnabled(false);

                // Inicia o cronômetro.
                running = true;
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
                running = false;
            }
        });
        // Adiciona os botões e o rótulo ao painel de conteúdo.
        jfrm.add(jbtnStart);
        jfrm.add(jbtnStop);
        jfrm.add(jlab);

        // Exibe o quadro.
        jfrm.setVisible(true);
    }
    // Atualiza a exibição do tempo decorrido.
    void updateTime() { //Este método é executado na thread de despacho de evento.
        if(!running) return;
        long temp = Calendar.getInstance().getTimeInMillis();
        jlab.setText("Elapsed time is " +
                (double) (temp - start)/1000);
    }
    public static void main(String[] args) {
        // Cria o quadro na thread de despacho de evento.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ThreadStopWatch();
            }
        });
    }
}
