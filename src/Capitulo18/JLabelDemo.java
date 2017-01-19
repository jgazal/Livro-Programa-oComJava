package Capitulo18;

// Demonstra JLabel e ImageIcon.
// Este exemplo exibe os três estados de um semáforo.

import javax.swing.*;
import java.awt.*;

class JLabelDemo {
    JLabelDemo() {

        // Cria um contêiner JFrame.
        JFrame jfrm = new JFrame("JLabel and ImageIcon Example");

        // Fornece um tamanho inicial para o quadro.
        jfrm.setSize(320, 280);

        // Encerra o programa quando o usuário fecha o aplicativo.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria um ícone e um rótulo para Go.
        ImageIcon goIcon = new ImageIcon("/home/jgazal/IdeaProjects/ProgramaçãoComJavaUIA/src/" +
                "Capitulo18/Go.png"); //Cria um ícone a partir de uma imagem armazenada em um arquivo.
        JLabel jlabGo = new JLabel(" Go ", goIcon, SwingConstants.LEFT);    //Cria um rótulo contendo um ícone e texto.

        // Cria um ícone e um rótulo para Caution.
        ImageIcon cautionIcon = new ImageIcon("/home/jgazal/IdeaProjects/ProgramaçãoComJavaUIA/src/" +
                "Capitulo18/Caution.png");
        JLabel jlabCaution = new JLabel(" Caution ", cautionIcon, SwingConstants.CENTER);

        // Cria um ícone e um rótulo para Stop.
        ImageIcon stopIcon = new ImageIcon("/home/jgazal/IdeaProjects/ProgramaçãoComJavaUIA/src/Capitulo18/Stop.png");
        JLabel jlabStop = new JLabel(" Stop ", stopIcon, SwingConstants.RIGHT);

        // Adiciona os rótulos ao painel de conteúdo.
        jfrm.add(jlabGo, BorderLayout.NORTH);
        jfrm.add(jlabCaution, BorderLayout.CENTER);
        jfrm.add(jlabStop, BorderLayout.SOUTH);

        // Exibe o quadro.
        jfrm.setVisible(true);
    }
    public static void main(String[] args) {
        // Cria a GUI na thread de despacho de evento.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new JLabelDemo();
            }
        });
    }
}
