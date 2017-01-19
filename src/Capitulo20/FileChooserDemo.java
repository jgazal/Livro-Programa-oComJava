package Capitulo20;

// Demonstra JFileChooser.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class FileChooserDemo {
    JLabel jlab;
    JButton jbtnShow;
    JFileChooser jfc;

    FileChooserDemo() {
        // Cria um contêiner JFrame.
        JFrame jfrm = new JFrame("JFileChooser Demo");

        // Especifica FlowLayout como gerenciador de leiaute.
        jfrm.setLayout(new FlowLayout());

        // Fornece um tamanho inicial para o quadro.
        jfrm.setSize(400, 200);

        // Encerra o programa quando o usuário fecha o aplicativo.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria um rótulo que exibirá o arquivo selecionado.
        jlab = new JLabel();

        // Cria um botão que exibirá a caixa de diálogo.
        jbtnShow = new JButton("Show File Chooser");

        // Cria o selecionador de arquivos.
        jfc = new JFileChooser();

        // Exibe o selecionador de arquivos quando o botão Show File Chooser é pressionado.
        jbtnShow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent le) {

                // Passa null para o pai. Isso centraliza a caixa de diálogo na tela.
                int result = jfc.showOpenDialog(null);  //Exibe o selecionador de arquivos.
                if(result == JFileChooser.APPROVE_OPTION)   //Se um arquivo for selecionado, exibe seu nome.
                    jlab.setText("Selected file is: " +
                            jfc.getSelectedFile().getName());
                else
                    jlab.setText("No file selected.");
            }
        });
        // Adiciona o botão Show File Chooser e o rótulo ao painel de conteúdo.
        jfrm.add(jbtnShow);
        jfrm.add(jlab);

        // Exibe o quadro.
        jfrm.setVisible(true);
    }
    public static void main(String[] args) {
        // Cria a GUI na thread de despacho de evento.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FileChooserDemo();
            }
        });
    }
}
