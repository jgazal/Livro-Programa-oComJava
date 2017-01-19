package Capitulo20;

// Tente isto 20-1: Demonstra um filtro de arquivos personalizado.

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;

// Um filtro de arquivos personalizado que exibe arquivos-fonte Java e diretórios.
class JavaFileFilter extends FileFilter {
    public boolean accept(File file) {

        // Retorna true se o arquivo for um arquivo-fonte Java ou se for um diretório.
        if(file.getName().endsWith(".java")) return true;
        if(file.isDirectory()) return true;

        // Caso contrário, retorna false.
        return false;
    }
    public String getDescription() {
        return "Java Source Code Files";
    }
}
public class FileFilterDemo {
    JLabel jlab;
    JButton jbtnShow;
    JFileChooser jfc;

    FileFilterDemo() {
        // Cria um contêiner JFrame.
        JFrame jfrm = new JFrame("File Filter Demo");

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

        // Configura o filtro de arquivos.
        jfc.setFileFilter(new JavaFileFilter());

        // Exibe o selecionador de arquivos quando o botão Show File Chooser é pressionado.
        jbtnShow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent le) {

                // Passa null para o pai. Normalmente isso centraliza a caixa de diálogo na tela.
                int result = jfc.showOpenDialog(null);
                if(result == JFileChooser.APPROVE_OPTION)
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
                new FileFilterDemo();
            }
        });
    }
}
