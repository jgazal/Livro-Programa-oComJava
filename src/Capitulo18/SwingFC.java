package Capitulo18;

/* Tente isto 18-1
   Um utilitário de comparação de arquivos baseado no Swing.*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

class SwingFC implements ActionListener {
    JTextField jtfFirst; // contém o nome do primeiro arquivo
    JTextField jtfSecond; // contém o nome do segundo arquivo
    JButton jbtnComp; // botão para comparar os arquivos
    JLabel jlabFirst, jlabSecond; // exibe avisos
    JLabel jlabResult; // exibe resultados e mensagens de erro
    JCheckBox jcbLoc; // marque para exibir o local da discrepância.

    SwingFC() {
        // Cria um contêiner JFrame.
        JFrame jfrm = new JFrame("Compare Files");

        // Especifica FlowLayout como gerenciador de leiaute.
        jfrm.setLayout(new FlowLayout());

        // Fornece um tamanho inicial para o quadro.
        jfrm.setSize(200, 220);

        // Encerra o programa quando o usuário fecha o aplicativo.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria os campos de texto para os nomes de arquivo.
        jtfFirst = new JTextField(14);
        jtfSecond = new JTextField(14);

        // Cria o botão Compare.
        JButton jbtnComp = new JButton("Compare");

        // Adiciona um ouvinte de ação para o botão Compare.
        jbtnComp.addActionListener(this);

        // Cria os rótulos.
        jlabFirst = new JLabel("First file: ");
        jlabSecond = new JLabel("Second file: ");
        jlabResult = new JLabel("");

        // Cria a caixa de seleção.
        jcbLoc = new JCheckBox("Show position of mismatch");

        // Adiciona os componentes ao painel de conteúdo.
        jfrm.add(jlabFirst);
        jfrm.add(jtfFirst);
        jfrm.add(jlabSecond);
        jfrm.add(jtfSecond);
        jfrm.add(jcbLoc);
        jfrm.add(jbtnComp);
        jfrm.add(jlabResult);

        // Exibe o quadro.
        jfrm.setVisible(true);
    }
    // Compara os arquivos quando o botão Compare é pressionado.
    public void actionPerformed(ActionEvent ae) {
        int i = 0, j = 0;
        int count = 0;

        // Primeiro, confirma se os dois nomes de arquivo foram inseridos.
        if(jtfFirst.getText().equals("")) {
            jlabResult.setText("First file name missing.");
            return;
        }
        if(jtfSecond.getText().equals("")) {
            jlabResult.setText("Second file name missing.");
            return;
        }

        // Compara arquivos. Usa try-with-recources para gerenciar os arquivos.
        try (FileInputStream f1 =
                     new FileInputStream(jtfFirst.getText());
             FileInputStream f2 =
                     new FileInputStream(jtfSecond.getText()))
        {
            // Verifica o conteúdo de cada arquivo.
            do {
                i = f1.read();
                j = f2.read();
                if(i != j) break;
                count++;
            } while(i != -1 && j != -1);
            if(i != j) {
                if(jcbLoc.isSelected())
                    jlabResult.setText("Files differ at location " + count);
                else
                    jlabResult.setText("Files are not the same.");
            }
            else
                jlabResult.setText("Files compare equal.");
        } catch(IOException exc) {
            jlabResult.setText("File Error");
        }
    }
    public static void main(String[] args) {
        // Cria a GUI na thread de despacho de evento.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingFC();
            }
        });
    }
}
