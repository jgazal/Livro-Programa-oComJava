package Capitulo18;

// Demonstra uma caixa de combinação simples.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JComboBoxDemo {
    JComboBox<String> jcbb;
    JLabel jlab;

    // Cria um array de variedades de maçãs.
    String[] apples = { "Winesap", "Cortland", "Red Delicious",
            "Golden Delicious", "Gala", "Fuji",
            "Granny Smith", "Jonathan" };

    JComboBoxDemo() {
        // Cria um contêiner JFrame.
        JFrame jfrm = new JFrame("JComboBox Demo");

        // Especifica FlowLayout como gerenciador de leiaute.
        jfrm.setLayout(new FlowLayout());

        // Fornece um tamanho inicial para o quadro.
        jfrm.setSize(380, 240);

        // Encerra o programa quando o usuário fecha o aplicativo.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria um JComboBox.
        jcbb = new JComboBox<String>(apples);

        // Cria um rótulo para exibir a seleção.
        jlab = new JLabel("Please Choose an Apple.");

        // Adiciona um ouvinte de ação para a caixa de combinação.
        jcbb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                // Obtém uma referência ao item selecionado.
                String item = (String) jcbb.getSelectedItem();

                // Exibe o item selecionado.
                jlab.setText("Current selection: " + item);
            }
        });
        // Adiciona a caixa de combinação e o rótulo ao painel de conteúdo.
        jfrm.add(jcbb);
        jfrm.add(jlab);

        // Exibe o quadro.
        jfrm.setVisible(true);
    }
    public static void main(String[] args) {
        // Cria a GUI na thread de despacho de evento.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new JComboBoxDemo();
            }
        });
    }
}
