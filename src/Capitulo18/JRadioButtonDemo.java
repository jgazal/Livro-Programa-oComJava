package Capitulo18;

// Demonstra JRadioButton.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JRadioButtonDemo implements ActionListener {
    JLabel jlab;

    JRadioButtonDemo() {
        // Cria um contêiner JFrame.
        JFrame jfrm = new JFrame("JRadioButton Example");

        // Especifica FlowLayout como gerenciador de leiaute.
        jfrm.setLayout(new FlowLayout());

        // Fornece um tamanho inicial para o quadro.
        jfrm.setSize(350, 100);

        // Encerra o programa quando o usuário fecha o aplicativo.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria botões de rádio e os adiciona ao painel de conteúdo.
        JRadioButton b1 = new JRadioButton("Debug");
        b1.addActionListener(this);
        jfrm.add(b1);
        JRadioButton b2 = new JRadioButton("Maximize Speed");
        b2.addActionListener(this);
        jfrm.add(b2);
        JRadioButton b3 = new JRadioButton("Minimize Size");
        b3.addActionListener(this);
        jfrm.add(b3);

        // Define um grupo de botões.
        ButtonGroup bg = new ButtonGroup();
        bg.add(b1);
        bg.add(b2);
        bg.add(b3);

        // Cria um rótulo e o adiciona ao painel de conteúdo.
        jlab = new JLabel("Select One");
        jfrm.add(jlab);

        // Exibe o quadro.
        jfrm.setVisible(true);
    }
    // Trata a seleção do botão.
    public void actionPerformed(ActionEvent ae) {
        jlab.setText("You selected " + ae.getActionCommand());
    }
    public static void main(String[] args) {
        // Cria a GUI na thread de despacho de evento.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new JRadioButtonDemo();
            }
        });
    }
}
