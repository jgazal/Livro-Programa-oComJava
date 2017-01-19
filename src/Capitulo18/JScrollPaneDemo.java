package Capitulo18;

// Um exemplo simples de JScrollPane.

import javax.swing.*;

class JScrollPaneDemo {
    JScrollPaneDemo() {
        // Cria um contêiner JFrame.
        JFrame jfrm = new JFrame("JScrollPane Example");

        // Fornece um tamanho inicial para o quadro.
        jfrm.setSize(200, 120);

        // Encerra o programa quando o usuário fecha o aplicativo.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria um rótulo longo baseado em HTML.
        JLabel jlab =
                new JLabel("<html>JScrollPane simplifies what would<br>" +
                        "otherwise be complicated tasks.<br>" +
                        "It can be used to scroll any lightweight <br>" +
                        "component or lightweight container. It is <br>" +
                        "especially useful when scrolling tables, lists,<br>" +
                        "or images.");

        // Cria um painel de rolagem e o faz rolar o rótulo.
        JScrollPane jscrlp = new JScrollPane(jlab);

        // Adiciona o painel de rolagem ao quadro.
        jfrm.add(jscrlp);

        // Exibe o quadro.
        jfrm.setVisible(true);
    }
    public static void main(String[] args) {

        // Cria a GUI na thread de despacho de evento.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new JScrollPaneDemo();
            }
        });
    }
}
