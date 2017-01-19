package Capitulo17;

// Demonstra um campo de texto.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JTextFieldDemo implements ActionListener {
    JTextField jtf;
    JLabel jlab;

    JTextFieldDemo() {
        // Cria um contêiner JFrame.
        JFrame jfrm = new JFrame("A Text Field Example");

        // Especifica FlowLayout como gerenciador de leiaute.
        jfrm.setLayout(new FlowLayout());

        // Fornece um tamanho inicial para o quadro.
        jfrm.setSize(240, 90);

        // Encerra o programa quando o usuário fecha o aplicativo.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria uma instância de campo de texto.
        jtf = new JTextField(10);   //Cria um campo de texto com 10 colunas

        // Adiciona um ouvinte de ação para o campo de texto.
        jtf.addActionListener(this);    //Define o ouvinte de ação para o campo de texto

        // Adiciona o campo de texto ao painel de conteúdo.
        jfrm.add(jtf);

        // Cria um rótulo vazio baseado em texto.
        jlab = new JLabel("");

        // Adiciona o rótulo ao quadro.
        jfrm.add(jlab);

        // Exibe o quadro.
        jfrm.setVisible(true);
    }
    // Trata eventos de ação.
    public void actionPerformed(ActionEvent ae) {       //Um evento de ação é gerado quando o usuário pressiona ENTER
                                                        // dentro de um campo de texto
        // Obtém o texto atual e o exibe em um rótulo.
        jlab.setText("Current contents: " + jtf.getText());
    }
    public static void main(String[] args) {
        // Cria o quadro no thread de despacho de evento.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new JTextFieldDemo();
            }
        });
    }
}

