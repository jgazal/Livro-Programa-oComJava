package Capitulo20;

// Usa uma caixa de diálogo de confirmação simples.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ConfirmDialogDemo {
    JLabel jlab;
    JButton jbtnShow;
    JFrame jfrm;

    ConfirmDialogDemo() {
        // Cria um contêiner JFrame.
        jfrm = new JFrame("A Confirmation Dialog");

        // Especifica FlowLayout como gerenciador de leiaute.
        jfrm.setLayout(new FlowLayout());

        // Fornece um tamanho inicial para o quadro.
        jfrm.setSize(400, 250);

        // Encerra o programa quando o usuário fecha o aplicativo.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria um rótulo para exibir a resposta do usuário.
        jlab = new JLabel();

        // Cria o botão que exibirá a caixa de diálogo.
        jbtnShow = new JButton("Show Dialog");

        // Adiciona um ouvinte de ação para o botão.
        jbtnShow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent le) {

                // Cria uma caixa de diálogo de confirmação.
                int response = JOptionPane.showConfirmDialog(
                        jfrm,
                        "Remove unused files?");

                // Exibe a resposta.
                switch(response) {  //Verifica a resposta do usuário e responde apropriadamente.
                    case JOptionPane.YES_OPTION:
                        jlab.setText("You answered Yes.");
                        break;
                    case JOptionPane.NO_OPTION:
                        jlab.setText("You answered No.");
                        break;
                    case JOptionPane.CANCEL_OPTION:
                        jlab.setText("Cancel pressed.");
                        break;
                    case JOptionPane.CLOSED_OPTION:
                        jlab.setText("Dialog closed without response.");
                        break;
                }
            }
        });
        //A caixa de diálogo exibida pelo exemplo anterior pode ser facilmente melhorada com a inclusão de um título
        // e a remoção do botão Cancel, como mostrado nesta versão de ActionListener do exemplo anterior:
 /*       jbtnShow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent le) {

                // Cria uma caixa de diálogo que exibe uma mensagem.
                int response = JOptionPane.showConfirmDialog(
                        jfrm,
                        "Remove unused files?", //Esta é a pergunta
                        "Disk Space Is Low",    //Este é o título
                        JOptionPane.YES_NO_OPTION); //Só exibe uma opção Yes e No.
                switch(response) {
                    case JOptionPane.YES_OPTION:
                        jlab.setText("You answered Yes.");
                        break;
                    case JOptionPane.NO_OPTION:
                        jlab.setText("You answered No.");
                        break;
                    case JOptionPane.CLOSED_OPTION:
                        jlab.setText("Dialog closed without response.");
                        break;
                }
            }
        });*/

        // Adiciona o botão e o rótulo ao painel de conteúdo.
        jfrm.add(jbtnShow);
        jfrm.add(jlab);

        // Exibe o quadro.
        jfrm.setVisible(true);
    }
    public static void main(String[] args) {
        // Cria a GUI na thread de despacho de evento.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ConfirmDialogDemo();
            }
        });
    }
}

