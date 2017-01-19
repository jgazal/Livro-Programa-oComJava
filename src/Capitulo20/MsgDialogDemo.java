package Capitulo20;

// Uma demonstração muito simples de JOptionPane.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MsgDialogDemo {
    JLabel jlab;
    JButton jbtnShow;
    JFrame jfrm;

    MsgDialogDemo() {
        // Cria um contêiner JFrame.
        jfrm = new JFrame("Simple Message Dialog");

        // Especifica FlowLayout como gerenciador de leiaute.
        jfrm.setLayout(new FlowLayout());

        // Fornece um tamanho inicial para o quadro.
        jfrm.setSize(400, 250);

        // Encerra o programa quando o usuário fecha o aplicativo.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria um rótulo para exibir que a caixa de diálogo foi fechada.
        jlab = new JLabel();

        // Cria um botão que exibirá a caixa de diálogo.
        jbtnShow = new JButton("Show Dialog");

        // Adiciona um ouvinte de ação para o botão.
        jbtnShow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent le) {
                jlab.setText("Dialog Opened");

                // Cria uma caixa de diálogo que exibirá uma mensagem.
                JOptionPane.showMessageDialog(jfrm,
                                              "Disk space is low."
                                              //,"Warning",
                                              //JOptionPane.WARNING_MESSAGE
                                              );

                // Essa instrução não será executada enquanto a chamada a showMessageDialog() não retornar.
                jlab.setText("Dialog Closed");
            }
        });
        // Adiciona o botão e o rótulo ao painel de conteúdo.
        jfrm.add(jbtnShow);
        jfrm.add(jlab);

        // Exibe o quadro.
        jfrm.setVisible(true);
    }
    public static void main(String[] args) {
        // Cria a GUI na thread de despacho de evento.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MsgDialogDemo();
            }
        });
    }
}
