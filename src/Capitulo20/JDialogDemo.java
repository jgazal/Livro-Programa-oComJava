package Capitulo20;

// Demonstra um JDialog simples.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JDialogDemo {
    JLabel jlab;
    JButton jbtnShow;
    JButton jbtnReset;
    // Esses botões ficam dentro da caixa de diálogo.
    JButton jbtnUp;
    JButton jbtnDown;
    JDialog jdlg;

    JDialogDemo() {
        // Cria um contêiner JFrame.
        JFrame jfrm = new JFrame("JDialog Demo");

        // Especifica FlowLayout como gerenciador de leiaute.
        jfrm.setLayout(new FlowLayout());

        // Fornece um tamanho inicial para o quadro.
        jfrm.setSize(400, 200);

        // Encerra o programa quando o usuário fecha o aplicativo.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria um rótulo que exibe a direção.
        jlab = new JLabel("Direction is pending.");

        // Cria um botão que exibirá a caixa de diálogo.
        jbtnShow = new JButton("Show Dialog");

        // Cria um botão que redefinirá a direção.
        jbtnReset = new JButton("Reset Direction");

        // Cria uma caixa de diálogo modal simples.
        jdlg = new JDialog(jfrm, "Direction", true);
        //jdlg = new JDialog(jfrm, "Direction"); //Transforma em não modal
        jdlg.setSize(200, 100);
        jdlg.setLayout(new FlowLayout());

        // Cria os botões usados pela caixa de diálogo.
        jbtnUp = new JButton("Up");
        jbtnDown = new JButton("Down");

        // Adiciona os botões à caixa de diálogo.
        jdlg.add(jbtnUp);
        jdlg.add(jbtnDown);

        // Adiciona um rótulo à caixa de diálogo.
        jdlg.add(new JLabel("Press a button."));

        // Exibe a caixa de diálogo quando o botão Show Dialog é pressionado.
        jbtnShow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent le) {
                jdlg.setVisible(true);
            }
        });
        // Redefine a direção quando o botão Reset Direction é pressionado.
        jbtnReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent le) {
                jlab.setText("Direction is pending.");
            }
        });
        // Responde ao botão Up da caixa de diálogo.
        jbtnUp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent le) {
                jlab.setText("Direction is Up");

                // Oculta a caixa de diálogo após o usuário selecionar uma direção.
                jdlg.setVisible(false); //Removendo, transforma em não modal
            }
        });
        // Responde ao botão Down da caixa de diálogo.
        jbtnDown.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent le) {
                jlab.setText("Direction is Down");
        // Oculta a caixa de diálogo após o usuário selecionar uma direção.
                jdlg.setVisible(false); ////Removendo, transforma em não modal
            }
        });
        // Adiciona o botão Show Dialog e o rótulo ao painel de conteúdo.
        jfrm.add(jbtnShow);
        jfrm.add(jbtnReset);
        jfrm.add(jlab);

        // Exibe o quadro.
        jfrm.setVisible(true);
    }
    public static void main(String[] args) {
        // Cria a GUI na thread de despacho de evento.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new JDialogDemo();
            }
        });
    }
}