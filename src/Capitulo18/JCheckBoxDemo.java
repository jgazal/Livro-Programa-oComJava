package Capitulo18;

// Demonstra JCheckBox.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JCheckBoxDemo implements ItemListener {
    JLabel jlabChange;
    JLabel jlabSupported;
    JCheckBox cbWin;
    JCheckBox cbLinux;
    JCheckBox cbMac;

    JCheckBoxDemo() {
        // Cria um contêiner JFrame.
        JFrame jfrm = new JFrame("JCheckBox Example");

        // Especifica FlowLayout como gerenciador de leiaute.
        jfrm.setLayout(new FlowLayout());

        // Fornece um tamanho inicial para o quadro.
        jfrm.setSize(340, 140);

        // Encerra o programa quando o usuário fecha o aplicativo.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Adiciona caixas de seleção ao painel de conteúdo.
        cbWin = new JCheckBox("Windows");
        cbWin.addItemListener(this);
        jfrm.add(cbWin);
        cbLinux = new JCheckBox("Linux");
        cbLinux.addItemListener(this);
        jfrm.add(cbLinux);
        cbMac = new JCheckBox("Mac OS");
        cbMac.addItemListener(this);
        jfrm.add(cbMac);

        // Cria rótulos.
        jlabChange = new JLabel("Select Supported Operating Systems");
        jfrm.add(jlabChange);
        jlabSupported = new JLabel();
        jfrm.add(jlabSupported);

        // Exibe o quadro.
        jfrm.setVisible(true);
    }
    // Trata eventos de item das caixas de seleção.
    public void itemStateChanged(ItemEvent ie) {    //Escuta eventos de item gerados pelas caixas de seleção.
        JCheckBox cb = (JCheckBox)ie.getItem();
        if(cb.isSelected()) //Determina se a caixa  de seleção foi marcada  ou desmarcada
            jlabChange.setText(cb.getText() + " has been selected");
        else
            jlabChange.setText(cb.getText() + " has been cleared");

        // Constrói um string que indica todas as seleções.
        String supported = "Supported Operating Systems: ";
        if(cbWin.isSelected()) supported += "Windows ";
        if(cbLinux.isSelected()) supported += "Linux ";
        if(cbMac.isSelected()) supported += "Mac OS";
        jlabSupported.setText(supported);
    }
    public static void main(String[] args) {
        // Cria a GUI na thread de despacho de evento.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new JCheckBoxDemo();
            }
        });
    }
}

