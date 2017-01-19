package Capitulo18;

// Demonstra JToggleButton.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JToggleButtonDemo {
    JLabel jlab;
    JToggleButton jtbn;

    JToggleButtonDemo() {
        // Cria um contêiner JFrame.
        JFrame jfrm = new JFrame("JToggleButton Example");

        // Especifica FlowLayout como gerenciador de leiaute.
        jfrm.setLayout(new FlowLayout());

        // Fornece um tamanho inicial para o quadro.
        jfrm.setSize(200, 100);

        // Encerra o programa quando o usuário fecha o aplicativo.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria um rótulo.
        jlab = new JLabel("Button is off.");

        // Cria um botão de alternância.
        jtbn = new JToggleButton("On/Off");

        // Adiciona um ouvinte de itens para o botão de alternância.
        jtbn.addItemListener(new ItemListener() {       //Usa um ItemListener para tratar eventos do
                                                        // botão de alternância.
            public void itemStateChanged(ItemEvent ie) {
                if(jtbn.isSelected())                   //Usa isSelected( )  para determinar o  estado do botão.
                    jlab.setText("Button is on.");
                else
                    jlab.setText("Button is off.");
            }
        });
        // Adiciona o botão de alternância e o rótulo ao painel de conteúdo.
        jfrm.add(jtbn);
        jfrm.add(jlab);

        // Exibe o quadro.
        jfrm.setVisible(true);
    }
    public static void main(String[] args) {
        // Cria a GUI na thread de despacho de evento.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new JToggleButtonDemo();
            }
        });
    }
}
