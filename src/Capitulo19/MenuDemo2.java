package Capitulo19;

/*Exercício 10.
Programa de demonstração do menu, versão final.*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MenuDemo2 implements ActionListener {
    JLabel jlab;
    JMenuBar jmb;

    MenuDemo2() {
        // Cria um contêiner JFrame.
        JFrame jfrm = new JFrame("Menu Demo");

        // Especifica FlowLayout como gerenciador de leiaute.
        jfrm.setLayout(new FlowLayout());

        // Fornece um tamanho inicial para o quadro.
        jfrm.setSize(220, 200);

        // Encerra o programa quando o usuário fecha o aplicativo.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria um rótulo que exibirá a seleção no menu.
        jlab = new JLabel();

        // Cria a barra de menus.
        jmb = new JMenuBar();

        // Cria o menu File.
        makeFileMenu();

        // Cria o menu Options.
        makeOptionsMenu();

        // Cria o menu Help.
        makeHelpMenu();

        // Adiciona o rótulo ao painel de conteúdo.
        jfrm.add(jlab);

        // Adiciona a barra de menus ao quadro.
        jfrm.setJMenuBar(jmb);

        // Exibe o quadro.
        jfrm.setVisible(true);
    }
    // Cria o menu File com mnemônicos e aceleradores.
    void makeFileMenu() {
        JMenu jmFile = new JMenu("File");
        jmFile.setMnemonic(KeyEvent.VK_F);  // O menu File tem F como seu mnemônico
        // Em todos os casos, o mnemônico é a primeira letra do nome do item.
        // O acelerador é a mesma letra em combinação com a tecla CTRL
        JMenuItem jmiOpen = new JMenuItem("Open",
                KeyEvent.VK_O);
        jmiOpen.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_O,
                        InputEvent.CTRL_DOWN_MASK));
        JMenuItem jmiClose = new JMenuItem("Close",
                KeyEvent.VK_C);
        jmiClose.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_C,
                        InputEvent.CTRL_DOWN_MASK));
        JMenuItem jmiSave = new JMenuItem("Save",
                KeyEvent.VK_S);
        jmiSave.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_S,
                        InputEvent.CTRL_DOWN_MASK));
        JMenuItem jmiExit = new JMenuItem("Exit",
                KeyEvent.VK_E);
        jmiExit.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_E,
                        InputEvent.CTRL_DOWN_MASK));
        jmFile.add(jmiOpen);
        jmFile.add(jmiClose);
        jmFile.add(jmiSave);
        jmFile.addSeparator();
        jmFile.add(jmiExit);
        jmb.add(jmFile);
        jmiOpen.addActionListener(this);
        jmiClose.addActionListener(this);
        jmiSave.addActionListener(this);
        jmiExit.addActionListener(this);
    }
    // Cria o menu Options.
    void makeOptionsMenu() {

        // Cria o menu Options.
        JMenu jmOptions = new JMenu("Options");

        // Cria o submenu Colors.
        JMenu jmColors = new JMenu("Colors");

        // Usa caixas de seleção para as cores. Isso permite que o usuário selecione mais de uma cor.
        // Observe que inicialmente Red está marcada.
        JCheckBoxMenuItem jmiRed = new JCheckBoxMenuItem("Red", true);
        JCheckBoxMenuItem jmiGreen = new JCheckBoxMenuItem("Green");
        JCheckBoxMenuItem jmiBlue = new JCheckBoxMenuItem("Blue");
        jmColors.add(jmiRed);
        jmColors.add(jmiGreen);
        jmColors.add(jmiBlue);
        jmOptions.add(jmColors);

        // Cria o submenu Priority.
        JMenu jmPriority = new JMenu("Priority");

        // Usa botões de rádio para a configuração da prioridade.
        // Isso permite que o menu exiba que prioridade está sendo usada, mas também assegura que uma
        // e apenas uma prioridade possa ser selecionada em um determinado momento.
        // Observe que inicialmente o botão de rádio High foi pressionado.
        JRadioButtonMenuItem jmiHigh =
                new JRadioButtonMenuItem("High", true);
        JRadioButtonMenuItem jmiLow =
                new JRadioButtonMenuItem("Low");
        jmPriority.add(jmiHigh);
        jmPriority.add(jmiLow);
        jmOptions.add(jmPriority);

        // Cria grupo de botões para os itens de menu de botão de rádio.
        ButtonGroup bg = new ButtonGroup();
        bg.add(jmiHigh);
        bg.add(jmiLow);

        // Cria o item de menu Reset.
        JMenuItem jmiReset = new JMenuItem("Reset");
        jmOptions.addSeparator();
        jmOptions.add(jmiReset);
        jmiRed.addActionListener(this);
        jmiGreen.addActionListener(this);
        jmiBlue.addActionListener(this);
        jmiHigh.addActionListener(this);
        jmiLow.addActionListener(this);
        jmiReset.addActionListener(this);

        // Para conluir, adiciona o menu Options inteiro à barra de menus
        jmb.add(jmOptions);
    }
    // Cria o menu Help.
    void makeHelpMenu() {

        // Cria o menu Help.
        JMenu jmHelp = new JMenu("Help");
        ImageIcon iconAbout = new ImageIcon("/home/jgazal/IdeaProjects/ProgramaçãoComJavaUIA/src/Capitulo19/" +
                                                                                            "AboutIcon.png");
        JMenuItem jmiAbout = new JMenuItem("About", iconAbout);
        jmiAbout.setToolTipText("Info about the MenuDemo program.");
        jmHelp.add(jmiAbout);
        jmb.add(jmHelp);
        jmiAbout.addActionListener(this);
    }
    // Trata eventos de ação dos itens de menu.
    public void actionPerformed(ActionEvent ae) {

        // Obtém o comando de ação da seleção no menu.
        String comStr = ae.getActionCommand();

        // Se o usuário selecionar Exit, encerra o programa.
        if(comStr.equals("Exit")) System.exit(0);

        // Caso contrário, exibe a seleção.
        jlab.setText(comStr + " Selected");
    }
    public static void main(String[] args) {
        // Cria a GUI na thread de despacho de evento.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MenuDemo2();
            }
        });
    }
}
