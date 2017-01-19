package Capitulo19;

// Tente isto 19-1: Adiciona e remove itens de menu dinamicamente.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class DynMenuDemo implements ActionListener {
    JLabel jlab;
    JMenuItem jmiYellow;
    JMenuItem jmiPurple;
    JMenuItem jmiOrange;
    JMenu jmColors;

    DynMenuDemo() {
        // Cria um contêiner JFrame.
        JFrame jfrm = new JFrame("Dynamic Menu Demo");

        // Especifica FlowLayout como gerenciador de leiaute.
        jfrm.setLayout(new FlowLayout());

        // Fornece um tamanho inicial para o quadro.
        jfrm.setSize(220, 200);

        // Encerra o programa quando o usuário fecha o aplicativo.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria um rótulo que exibirá a seleção feita no menu.
        jlab = new JLabel();

        // Cria a barra de menus.
        JMenuBar jmb = new JMenuBar();

        // Cria o menu File.
        JMenu jmFile = new JMenu("File");
        JMenuItem jmiOpen = new JMenuItem("Open");
        JMenuItem jmiClose = new JMenuItem("Close");
        JMenuItem jmiSave = new JMenuItem("Save");
        JMenuItem jmiExit = new JMenuItem("Exit");
        jmFile.add(jmiOpen);
        jmFile.add(jmiClose);
        jmFile.add(jmiSave);
        jmFile.addSeparator();
        jmFile.add(jmiExit);
        jmb.add(jmFile);

        // Cria o menu Options.
        JMenu jmOptions = new JMenu("Options");

        // Cria o submenu Colors.
        jmColors = new JMenu("Colors");
        JMenuItem jmiRed = new JMenuItem("Red");
        JMenuItem jmiGreen = new JMenuItem("Green");
        JMenuItem jmiBlue = new JMenuItem("Blue");
        jmColors.add(jmiRed);
        jmColors.add(jmiGreen);
        jmColors.add(jmiBlue);

        // Cria o item de menu More/Fewer Colors.
        JMenuItem jmiMoreLess = new JMenuItem("More Colors");
        jmColors.add(jmiMoreLess);

        // Adiciona o menu Colors ao menu Options.
        jmOptions.add(jmColors);

        // Cria as cores adicionais. Elas serão adicionadas ou removidas sob demanda.
        jmiYellow = new JMenuItem("Yellow");
        jmiPurple = new JMenuItem("Purple");
        jmiOrange = new JMenuItem("Orange");

        // Cria o submenu Priority.
        JMenu jmPriority = new JMenu("Priority");
        JMenuItem jmiHigh = new JMenuItem("High");
        JMenuItem jmiLow = new JMenuItem("Low");
        jmPriority.add(jmiHigh);
        jmPriority.add(jmiLow);

        // Adiciona o menu Priority ao menu Options.
        jmOptions.add(jmPriority);

        // Cria o item de menu Reset.
        JMenuItem jmiReset = new JMenuItem("Reset");
        jmOptions.addSeparator();
        jmOptions.add(jmiReset);

        // Para finalizar, adiciona o menu Options inteiro à barra de menus
        jmb.add(jmOptions);

        // Cria o menu Help.
        JMenu jmHelp = new JMenu("Help");
        JMenuItem jmiAbout = new JMenuItem("About");
        jmHelp.add(jmiAbout);
        jmb.add(jmHelp);

        // Adiciona ouvintes de ação para os itens de menu.
        jmiOpen.addActionListener(this);
        jmiClose.addActionListener(this);
        jmiSave.addActionListener(this);
        jmiExit.addActionListener(this);
        jmiRed.addActionListener(this);
        jmiGreen.addActionListener(this);
        jmiBlue.addActionListener(this);
        jmiHigh.addActionListener(this);
        jmiLow.addActionListener(this);
        jmiReset.addActionListener(this);
        jmiAbout.addActionListener(this);

        // Adiciona ouvintes para a opção de cores adicionais.
        jmiMoreLess.addActionListener(this);
        jmiYellow.addActionListener(this);
        jmiPurple.addActionListener(this);
        jmiOrange.addActionListener(this);

        // Adiciona o rótulo ao painel de conteúdo.
        jfrm.add(jlab);

        // Adiciona a barra de menus ao quadro.
        jfrm.setJMenuBar(jmb);

        // Exibe o quadro.
        jfrm.setVisible(true);
    }
    // Trata eventos de ação dos itens de menu.
    public void actionPerformed(ActionEvent ae) {
        // Obtém o comando de ação da seleção feita no menu.
        String comStr = ae.getActionCommand();

        // Se o usuário selecionar Exit, encerra o programa.
        if(comStr.equals("Exit"))
            System.exit(0);
        else if(comStr.equals("More Colors")) {
            jmColors.add(jmiYellow);
            jmColors.add(jmiPurple);
            jmColors.add(jmiOrange);
            JMenuItem mi = (JMenuItem) ae.getSource();
            mi.setText("Fewer Colors");
        } else if(comStr.equals("Fewer Colors")) {
            jmColors.remove(jmiYellow);
            jmColors.remove(jmiPurple);
            jmColors.remove(jmiOrange);
            JMenuItem mi = (JMenuItem) ae.getSource();
            mi.setText("More Colors");
        }
        // Caso contrário, exibe a opção selecionada.
        jlab.setText(comStr + " Selected");
    }
    public static void main(String[] args) {
        // Cria a GUI na thread de despacho de evento.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new DynMenuDemo();
            }
        });
    }
}
