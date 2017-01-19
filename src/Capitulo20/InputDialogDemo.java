package Capitulo20;

// Uma caixa de diálogo de entrada simples.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class InputDialogDemo {
    JLabel jlab;
    JButton jbtnShow;
    JFrame jfrm;

    InputDialogDemo() {
        // Cria um contêiner JFrame.
        jfrm = new JFrame("A Simple Input Dialog");

        // Especifica FlowLayout como gerenciador de leiaute.
        jfrm.setLayout(new FlowLayout());

        // Fornece um tamanho inicial para o quadro.
        jfrm.setSize(400, 250);

        // Encerra o programa quando o usuário fecha o aplicativo.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria um rótulo que exibe a resposta.
        jlab = new JLabel();

        // Cria um botão que exibirá a caixa de diálogo.
        jbtnShow = new JButton("Show Dialog");

        // Adiciona um ouvinte de ação para o botão.
        jbtnShow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent le) {

                // Cria uma caixa de diálogo para receber o string.
                String response = JOptionPane.showInputDialog(
                        "Enter Name");
                // A chamada a showInputDialog( ) a seguir cria uma caixa de diálogo que será posicionada em
                // relação à janela principal e inicializada com o nome “Bob Smith”.
                /*String response = JOptionPane.showInputDialog(
                        jfrm, "Enter Name", "Bob Smith");*/

                // Se a resposta for null, a caixa de diálogo foi cancelada ou fechada.
                // Se a resposta for um string de tamanho zero, nenhuma entrada foi inserida.
                // Caso contrário, a resposta conterá um string inserido pelo usuário.
                if(response == null)    //Uma resposta null  significa que a  caixa de diálogo foi cancelada ou fechada
                    jlab.setText("Dialog cancelled or closed");
                else if(response.length() == 0)
                    jlab.setText("No string entered");
                else
                    jlab.setText("Hi there " + response);
            }
        });

        //A caixa de diálogo criada por essa versão de showInputDialog( ) será particularmente útil se quisermos
        // limitar o usuário a um intervalo de opções. Para ver esse tipo de caixa de diálogo de entrada em ação,
        // substitua o ouvinte de ações do exemplo de programa pelo mostrado a seguir:
/*        jbtnShow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent le) {
                String[] names = { "Tom Jones", "Bob Smith",
                                    "Mary Doe", "Nancy Oliver" };
                // Cria uma caixa de diálogo que permite que o usuário faça uma escolha em uma lista de nomes.
                String response =
                        (String) JOptionPane.showInputDialog(
                                jfrm,
                                "Choose User",
                                "Select User Name",
                                JOptionPane.QUESTION_MESSAGE,
                                null,
                                names,
                                "Bob Smith");
                if(response == null)
                    jlab.setText("Dialog cancelled or closed");
                else if(response.length() == 0)
                    jlab.setText("No string entered");
                else
                    jlab.setText("Hi there " + response);
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
                new InputDialogDemo();
            }
        });
    }
}
