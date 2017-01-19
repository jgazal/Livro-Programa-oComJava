package Capitulo18;

// Demonstra um JList simples.

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class JListDemo {
    JList<String> jlst;
    JLabel jlab;
    JScrollPane jscrlp;

    // Cria um array de variedades de maçãs.
    String[] apples = { "Winesap", "Cortland", "Red Delicious",
            "Golden Delicious", "Gala", "Fuji",
            "Granny Smith", "Jonathan" };

    JListDemo() {
        // Cria um contêiner JFrame.
        JFrame jfrm = new JFrame("JList Demo");

        // Especifica o gerenciador FlowLayout.
        jfrm.setLayout(new FlowLayout());

        // Fornece um tamanho inicial para o quadro.
        jfrm.setSize(240, 200);

        // Encerra o programa quando o usuário fecha o aplicativo.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria um JList.
        jlst = new JList<String>(apples);

        // Define o modo de seleção da lista com a seleção simples.
        jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Adiciona a lista a um painel de rolagem.
        jscrlp = new JScrollPane(jlst);

        // Define o tamanho ótimo do painel de rolagem.
        jscrlp.setPreferredSize(new Dimension(120, 90));

        // Cria um rótulo para exibir a seleção.
        jlab = new JLabel("Please Choose an Apple.");

        // Adiciona um ouvinte de seleção para a lista.
        jlst.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent le) {
                // Obtém o índice do item alterado.
                int idx = jlst.getSelectedIndex();  //Obtém o índice da seleção atual.

                // Exibe a seleção, se o item for selecionado.
                if(idx != -1)
                    jlab.setText("Current selection: " + apples[idx]);
                else // Caso contrário, solicita novamente.
                    jlab.setText("Please Choose an Apple.");
            }
        });
        // Adiciona a lista e o rótulo ao painel de conteúdo.
        jfrm.add(jscrlp);
        jfrm.add(jlab);

        // Exibe o quadro.
        jfrm.setVisible(true);
    }
    public static void main(String[] args) {
        // Cria a GUI na thread de despacho de evento.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new JListDemo();
            }
        });
    }
}