package Capitulo17;

// Usa dois campos de texto.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TwoTFDemo implements ActionListener {
    JTextField jtf1;
    JTextField jtf2;
    JLabel jlab;

    TwoTFDemo() {
        // Cria um contêiner JFrame.
        JFrame jfrm = new JFrame("Use Two Text Fields");

        // Especifica FlowLayout como gerenciador de leiaute.
        jfrm.setLayout(new FlowLayout());

        // Fornece um tamanho inicial para o quadro.
        jfrm.setSize(240, 120);

        // Encerra o programa quando o usuário fecha o aplicativo.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria duas instâncias de campo de texto.
        jtf1 = new JTextField(10);
        jtf2 = new JTextField(10);

        // Define os comandos de ação.
        jtf1.setActionCommand("One");
        jtf2.setActionCommand("Two");

        // Adiciona ouvintes de ação para os campos de texto.
        jtf1.addActionListener(this);
        jtf2.addActionListener(this);

        // Adiciona os campos de texto ao painel de conteúdo.
        jfrm.add(jtf1);
        jfrm.add(jtf2);

        // Cria um rótulo vazio baseado em texto.
        jlab = new JLabel("");

        // Adiciona o rótulo ao quadro.
        jfrm.add(jlab);

        // Exibe o quadro.
        jfrm.setVisible(true);
    }
    // Trata eventos de ação.
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("One"))     //Usa o string do comando  de ação para determinar  qual
                                                    // campo de texto  acionou o evento
            jlab.setText("ENTER pressed in tf1: " + jtf1.getText());
        else
            jlab.setText("ENTER pressed in jtf2: " + jtf2.getText());
    }
    public static void main(String[] args) {
        // Cria o quadro na thread de despacho de evento.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TwoTFDemo();
            }
        });
    }
}