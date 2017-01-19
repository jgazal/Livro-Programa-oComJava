package Capitulo18;

// Tente isto 18-2: Usa um JScrollPane para rolar um JPanel.

import java.awt.*;
import javax.swing.*;

class ScrollJPanelDemo {
    ScrollJPanelDemo() {
        // Cria um contêiner JFrame.
        JFrame jfrm = new JFrame("Scroll a JPanel");

        // Fornece um tamanho inicial para o quadro.
        jfrm.setSize(280, 130);

        // Encerra o programa quando o usuário fecha o aplicativo.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria um rótulo.
        JLabel jlabOptions = new JLabel("Select one or more options: ");

        // Cria algumas caixas de seleção.
        JCheckBox jcbOpt1 = new JCheckBox("Option One");
        JCheckBox jcbOpt2 = new JCheckBox("Option Two");
        JCheckBox jcbOpt3 = new JCheckBox("Option Three");
        JCheckBox jcbOpt4 = new JCheckBox("Option Four");
        JCheckBox jcbOpt5 = new JCheckBox("Option Five");
        JCheckBox jcbOpt6 = new JCheckBox("Option Six");
        JCheckBox jcbOpt7 = new JCheckBox("Option Seven");
        JCheckBox jcbOpt8 = new JCheckBox("Option Eight");
        JCheckBox jcbOpt9 = new JCheckBox("Option Nine");
        JCheckBox jcbOpt10 = new JCheckBox("Option Ten");

        // Nenhum tratador de eventos é usado por este exemplo,
        // mas, como exercício, você pode tentar adicionar alguns.

        // Cria o JPanel que conterá as caixas de seleção das opções.
        JPanel jpnl = new JPanel();
        jpnl.setLayout(new GridLayout(5, 3));

        // Adiciona as caixas de seleção e o rótulo ao JPanel.
        jpnl.add(jlabOptions);
        jpnl.add(new JLabel("")); // rótulo de espaço reservado
        jpnl.add(new JLabel("")); // rótulo de espaço reservado
        jpnl.add(jcbOpt1);
        jpnl.add(jcbOpt2);
        jpnl.add(jcbOpt3);
        jpnl.add(jcbOpt4);
        jpnl.add(jcbOpt5);
        jpnl.add(jcbOpt6);
        jpnl.add(jcbOpt7);
        jpnl.add(jcbOpt8);
        jpnl.add(jcbOpt9);
        jpnl.add(jcbOpt10);

        // Cria o painel de rolagem que rolará o outro painel.
        JScrollPane jscrlp = new JScrollPane(jpnl);

        // Adiciona o painel de rolagem ao quadro.
        jfrm.add(jscrlp);

        // Exibe o quadro.
        jfrm.setVisible(true);
    }
    public static void main(String[] args) {
        // Cria a GUI na thread de despacho de evento.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ScrollJPanelDemo();
            }
        });
    }
}
