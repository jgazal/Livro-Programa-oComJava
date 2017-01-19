package Capitulo17;

// Um programa Swing simples.

import javax.swing.*;   //Os programas Swing devem importar javax.swing

class SwingDemo {

    SwingDemo() {
        // Cria um contêiner JFrame.
        JFrame jfrm = new JFrame("A Simple Swing Application");     //Cria um contêiner de nível superior

        // Fornece um tamanho inicial para o quadro.
        jfrm.setSize(275, 100); //Define as dimensões do contêiner

        // Encerra o programa quando o usuário fecha o aplicativo.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //Encerra o programa quando o usuário
                                                                // clica na caixa Fechar.
        // Cria um rótulo baseado em texto.
        JLabel jlab = new JLabel(" Swing defines the modern Java GUI.");    //Cria um JLabel

        // Adiciona o rótulo ao painel de conteúdo.
        jfrm.add(jlab); //Adiciona o rótulo ao painel de conteúdo

        // Exibe o quadro.
        jfrm.setVisible(true);  //Torna o quadro visível
    }

    public static void main(String[] args) {
        // Cria o quadro na thread de despacho de evento.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingDemo();    //Cria a GUI na thread de despacho de evento
            }
        });
    }
}