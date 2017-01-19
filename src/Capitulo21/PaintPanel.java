package Capitulo21;

// Pinta linhas em um painel.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

// Esta classe estende JPanel. Ela sobrepõe o método paintComponent()
// para que dados aleatórios sejam demonstrados no painel.
class PaintPanel extends JPanel {
    Insets ins; // contém os espaços adicionais do painel
    Random rand; // usada para gerar números aleatórios
    PaintPanel(int w, int h) {

        // Usa uma borda de linha vermelha.
        setBorder(BorderFactory.createLineBorder(Color.RED, 1));

        // Define a dimensão ideal como especificado.
        setPreferredSize(new Dimension(w, h));
        rand = new Random();
    }
    // Sobrepõe o método paintComponent().
    protected void paintComponent(Graphics g) { //Sobrepõe paintComponent( ) para pintar na superfície do componente.

        // Chame sempre o método da superclasse primeiro.
        super.paintComponent(g);    //Lembre-se de chamar a implementação da superclasse.

        // Obtém a altura e largura do componente.
        int height = getHeight();
        int width = getHeight();

        // Obtém os espaços adicionais.
        ins = getInsets();

        // Preenche o painel demonstrando dados aleatórios na forma de um gráfico de barras.
        for(int i=ins.left+5; i <= width-ins.right-5; i += 4) {

            // Obtém um número aleatório entre 0 e a altura máxima da área de desenho.
            int h = rand.nextInt(height-ins.bottom);

            // Se um valor gerado ficar em cima ou muito próximo da borda,
            // ele é alterado para que fique dentro da borda.
            if(h <= ins.top) h = ins.top+1;

            // Desenha uma linha que representa os dados.
            g.drawLine(i, height-ins.bottom, i, h);
        }
    }
    // Altera o tamanho da borda.
    public void changeBorderSize(int size) {
        setBorder(
                BorderFactory.createLineBorder(Color.RED, size));
    }
}
// Demonstra a pintura diretamente em um painel.
class PaintDemo {
    JButton jbtnMore;
    JButton jbtnSize;
    JLabel jlab;
    PaintPanel pp;
    boolean big; // usa para alternar o tamanho do painel

    PaintDemo() {
        // Cria um contêiner JFrame
        JFrame jfrm = new JFrame("Painting Demo");

        // Especifica FlowLayout como gerenciador de leiaute.
        jfrm.setLayout(new FlowLayout());

        // Fornece um tamanho inicial para o quadro.
        jfrm.setSize(240, 260);

        // Encerra o programa quando o usuário fecha o aplicativo.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria o painel que será pintado.
        pp = new PaintPanel(100, 100);

        // Cria os botões.
        jbtnMore = new JButton("Show More Data");
        jbtnSize = new JButton("Change Border Size");

        // Descreve o gráfico.
        jlab = new JLabel("Bar Graph of Random Data");

        // Pinta novamente o painel quando o botão Show More Data é clicado.
        jbtnMore.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                pp.repaint();   //Solicita que o painel seja pintado.
            }
        });
        // Define o tamanho da borda do painel quando o botão Change Size Border é clicado.
        // A alteração do tamanho da borda resulta automaticamente em uma nova pintura.
        jbtnSize.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {   //Altera o tamanho da borda do gráfico.
                if(!big) pp.changeBorderSize(5);
                else pp.changeBorderSize(1);
                big = !big;
            }
        });
        // Adiciona os botões, o rótulo e o painel ao painel de conteúdo.
        jfrm.add(jlab);
        jfrm.add(pp);
        jfrm.add(jbtnMore);
        jfrm.add(jbtnSize);
        big = false;

        // Exibe o quadro.
        jfrm.setVisible(true);
    }
    public static void main(String[] args) {
        // Cria o quadro na thread de despacho de evento.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new PaintDemo();
            }
        });
    }
}

