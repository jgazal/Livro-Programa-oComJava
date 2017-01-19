package Capitulo18;

// Demonstra vários recursos de um campo de texto.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class JTextFieldDemo {
    JLabel jlabAll;
    JLabel jlabSelected;
    JTextField jtf;
    JButton jbtnCut;
    JButton jbtnPaste;

    public JTextFieldDemo() {
        // Cria um contêiner JFrame.
        JFrame jfrm = new JFrame("JTextField Example");

        // Especifica FlowLayout como gerenciador de leiaute.
        jfrm.setLayout(new FlowLayout());

        // Fornece um tamanho inicial para o quadro.
        jfrm.setSize(200, 150);

        // Encerra o programa quando o usuário fecha o aplicativo.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria rótulos.
        jlabAll = new JLabel("All text: ");
        jlabSelected = new JLabel("Selected text: ");

        // Cria o campo de texto.
        jtf = new JTextField("This is a test.", 15);

        // Adiciona um ouvinte de ação para o campo de texto.
        // Sempre que o usuário pressionar enter, o conteúdo do campo será exibido.
        // Qualquer texto selecionado atualmente também será exibido.
        jtf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jlabAll.setText("All text: " + jtf.getText());
                if(jtf.getSelectedText() != null)
                    jlabSelected.setText("Selected text: " +
                            jtf.getSelectedText());
            }
        });
        // Cria os botões Cut e Paste.
        jbtnCut = new JButton("Cut");
        jbtnPaste = new JButton("Paste");

        // Adiciona um ouvinte de ação para o botão Cut.
        jbtnCut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                // Recorta o texto selecionado e o insere na área de transferência.
                jtf.cut();  //Remove o texto selecionado e o insere na área de transferência.
                jlabAll.setText("All text: " + jtf.getText());
                if(jtf.getSelectedText() != null)
                    jlabSelected.setText("Selected text: " +
                            jtf.getSelectedText());
            }
        });
        // Adiciona um ouvinte de ação para o botão Paste.
        jbtnPaste.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                // Cola o texto da área de transferência no campo de texto.
                jtf.paste();    //Copia texto da área de transferência.
            }
        });
        // Adiciona os componentes ao painel de conteúdo.
        jfrm.add(jtf);
        jfrm.add(jbtnCut);
        jfrm.add(jbtnPaste);
        jfrm.add(jlabAll);
        jfrm.add(jlabSelected);

        // Exibe o quadro.
        jfrm.setVisible(true);
    }
    public static void main(String[] args) {
        // Cria a GUI na thread de despacho de evento.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new JTextFieldDemo();
            }
        });
    }
}