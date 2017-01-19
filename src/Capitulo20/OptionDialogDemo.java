package Capitulo20;

// Uma caixa de diálogo de opções.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class OptionDialogDemo {
    JLabel jlab;
    JButton jbtnShow;
    JFrame jfrm;

    OptionDialogDemo() {
        // Cria um contêiner JFrame.
        jfrm = new JFrame("A Simple Option Dialog");

        // Especifica FlowLayout como gerenciador de leiaute.
        jfrm.setLayout(new FlowLayout());

        // Fornece um tamanho inicial para o quadro.
        jfrm.setSize(400, 250);

        // Encerra o programa quando o usuário fecha o aplicativo.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria um rótulo que exibirá a seleção.
        jlab = new JLabel();

        // Cria um botão que exibirá a caixa de diálogo.
        jbtnShow = new JButton("Show Dialog");

        // Adiciona um ouvinte de ação para o botão.
        jbtnShow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent le) {

                // Define as opções de conexão.
                String[] connectOpts = { "Modem", "Wireless",
                                         "Satellite", "Cable" };

                // Cria uma caixa de diálogo que permite que o usuário selecione como se conectará à rede.
                int response = JOptionPane.showOptionDialog(
                        jfrm,
                        "Choose Network Connection",
                        "Connection Type",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        connectOpts,
                        "Wireless");

                // Exibe a seleção.
                switch(response) {
                    case 0:
                        jlab.setText("Connect via modem.");
                        break;
                    case 1:
                        jlab.setText("Connect via wireless.");
                        break;
                    case 2:
                        jlab.setText("Connect via satellite.");
                        break;
                    case 3:
                        jlab.setText("Connect via cable.");
                        break;
                    case JOptionPane.CLOSED_OPTION:
                        jlab.setText("Dialog cancelled.");
                        break;
                }
            }
        });
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
                new OptionDialogDemo();
            }
        });
    }
}
