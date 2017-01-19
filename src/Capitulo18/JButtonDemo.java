package Capitulo18;

// Demonstra JButtons baseados em ícones.
// Este exemplo exibe ícones de semáforo dentro de botões.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JButtonDemo implements ActionListener {
    JLabel jlab;

    JButtonDemo() {
        // Cria um contêiner JFrame.
        JFrame jfrm = new JFrame("JButton Example");

        // Especifica FlowLayout como gerenciador de leiaute.
        jfrm.setLayout(new FlowLayout());

        // Fornece um tamanho inicial para o quadro.
        jfrm.setSize(300, 180);

        // Encerra o programa quando o usuário fecha o aplicativo.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria os botões.
        ImageIcon goIcon = new ImageIcon("/home/jgazal/IdeaProjects/ProgramaçãoComJavaUIA/src/Capitulo18/Go.png");
        JButton jbtnGo = new JButton(goIcon);
        jbtnGo.setActionCommand("Go");
        jbtnGo.addActionListener(this);
        ImageIcon cautionIcon = new ImageIcon("/home/jgazal/IdeaProjects/ProgramaçãoComJavaUIA/src/" +
                "Capitulo18/Caution.png");
        JButton jbtnCaution = new JButton(cautionIcon);
        jbtnCaution.setActionCommand("Caution");
        jbtnCaution.addActionListener(this);
        ImageIcon stopIcon = new ImageIcon("/home/jgazal/IdeaProjects/ProgramaçãoComJavaUIA/src/" +
                "Capitulo18/Stop.png");
        JButton jbtnStop = new JButton(stopIcon);
        jbtnStop.setActionCommand("Stop");
        jbtnStop.addActionListener(this);

        // Adiciona os botões ao painel de conteúdo.
        jfrm.add(jbtnGo);
        jfrm.add(jbtnCaution);
        jfrm.add(jbtnStop);

        // Cria e adiciona o rótulo ao painel de conteúdo.
        jlab = new JLabel("Select a Traffic Light");
        jfrm.add(jlab);

        // Exibe o quadro.
        jfrm.setVisible(true);
    }
    // Trata eventos de botão.
    public void actionPerformed(ActionEvent ae) {
        jlab.setText("You selected " + ae.getActionCommand() + ".");
    }
    public static void main(String[] args) {
        // Cria a GUI na thread de despacho de evento.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new JButtonDemo();
            }
        });
    }
}