package Capitulo17;

// Demonstra um botão.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ButtonDemo implements ActionListener {
    JLabel jlab;

    ButtonDemo() {
        // Cria um contêiner JFrame.
        JFrame jfrm = new JFrame("A Button Example");

        // Especifica FlowLayout como gerenciador de leiaute.
        jfrm.setLayout(new FlowLayout());

        // Fornece um tamanho inicial para o quadro.
        jfrm.setSize(220, 90);

        // Encerra o programa quando o usuário fecha o aplicativo.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria dois botões.
        JButton jbtnFirst = new JButton("First");
        JButton jbtnSecond = new JButton("Second");

        // Adiciona ouvintes de ação.
        jbtnFirst.addActionListener(this);
        jbtnSecond.addActionListener(this);

        // Adiciona os botões ao painel de conteúdo.
        jfrm.add(jbtnFirst);
        jfrm.add(jbtnSecond);

        // Cria um rótulo baseado em texto.
        jlab = new JLabel("Press a button.");

        // Adiciona o rótulo ao quadro.
        jfrm.add(jlab);

        // Exibe o quadro.
        jfrm.setVisible(true);
    }
    // Trata eventos de botão.
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("First"))       //Usa o string do comando de ação para determinar
                                                        // qual botão foi pressionado.
            jlab.setText("First button was pressed.");
        else
            jlab.setText("Second button was pressed. ");
    }
    public static void main(String[] args) {
        // Cria o quadro na thread de despacho de evento.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ButtonDemo();
            }
        });
    }
}

