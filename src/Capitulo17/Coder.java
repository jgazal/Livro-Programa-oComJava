package Capitulo17;

// Tente isto 17-2: Uma máquina de codificação simples.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Coder implements ActionListener {
    JTextField jtfPlaintext;
    JTextField jtfCiphertext;

    Coder() {
        // Cria um contêiner JFrame.
        JFrame jfrm = new JFrame("A Simple Code Machine");

        // Especifica FlowLayout como gerenciador de leiaute.
        jfrm.setLayout(new FlowLayout());

        // Fornece um tamanho inicial para o quadro.
        jfrm.setSize(340, 130);

        // Encerra o programa quando o usuário fecha o aplicativo.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria dois rótulos.
        JLabel jlabPlaintext = new JLabel(" Plain Text: ");
        JLabel jlabCiphertext = new JLabel("Cipher Text: ");

        // Cria duas instâncias de campo de texto.
        jtfPlaintext = new JTextField(20);
        jtfCiphertext = new JTextField(20);

        // Define os comandos de ação dos campos de texto.
        jtfPlaintext.setActionCommand("Encode");
        jtfCiphertext.setActionCommand("Decode");

        // Adiciona ouvintes de ação para os campos de texto.
        jtfPlaintext.addActionListener(this);
        jtfCiphertext.addActionListener(this);

        // Adiciona os campos de texto e rótulos ao painel de conteúdo.
        jfrm.add(jlabPlaintext);
        jfrm.add(jtfPlaintext);
        jfrm.add(jlabCiphertext);
        jfrm.add(jtfCiphertext);

        // Cria instâncias de botões de ação.
        JButton jbtnEncode = new JButton("Encode");
        JButton jbtnDecode = new JButton("Decode");
        JButton jbtnReset = new JButton("Reset");

        // Adiciona ouvintes de ação para os botões.
        jbtnEncode.addActionListener(this);
        jbtnDecode.addActionListener(this);
        jbtnReset.addActionListener(this);

        // Adiciona os botões ao painel de conteúdo.
        jfrm.add(jbtnEncode);
        jfrm.add(jbtnDecode);
        jfrm.add(jbtnReset);

        // Exibe o quadro.
        jfrm.setVisible(true);
    }
    // Trata eventos de ação.
    public void actionPerformed(ActionEvent ae) {

        // Se o comando de ação for "Encode", codifica o string.
        if(ae.getActionCommand().equals("Encode")) {

            // Essa variável conterá o string codificado.
            String encStr = "";

            // Obtém o texto sem codificação.
            String str = jtfPlaintext.getText();

            // Adiciona 1 a cada caractere.
            for(int i=0; i<str.length(); i++)
                encStr += (char)(str.charAt(i) + 1);

            // Insere o texto codificado no campo Cipher Text.
            jtfCiphertext.setText(encStr.toString());
        }
        // Se o comando de ação for "Decode", decodifica o string.
        else if(ae.getActionCommand().equals("Decode")) {

            // Essa variável conterá o string decodificado.
            String decStr = "";

            // Obtém o texto codificado.
            String str = jtfCiphertext.getText();

            // Subtrai 1 de cada caractere.
            for(int i=0; i<str.length(); i++)
                decStr += (char)(str.charAt(i) - 1);

            // Insere o texto decodificado no campo Plain Text.
            jtfPlaintext.setText(decStr.toString());
        }
        // Só sobrou o comando "Reset".
        else {
            jtfPlaintext.setText("");
            jtfCiphertext.setText("");
        }
    }
    public static void main(String[] args) {
        // Cria o quadro na thread de despacho de evento.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Coder();
            }
        });
    }
}
