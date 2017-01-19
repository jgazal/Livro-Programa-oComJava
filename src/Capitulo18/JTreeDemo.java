package Capitulo18;

// Demonstra JTree.

import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;
import javax.swing.tree.*;

public class JTreeDemo {
    JTree tree;
    JLabel jlab;

    JTreeDemo() {
        // Cria um contêiner JFrame.
        JFrame jfrm = new JFrame("JTree Example");

        // Fornece um tamanho inicial para o quadro.
        jfrm.setSize(300, 240);

        // Encerra o programa quando o usuário fecha o aplicativo.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria o nó raiz da árvore.
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Java Keywords");

        // Cria subárvore para tipos.
        DefaultMutableTreeNode types = new DefaultMutableTreeNode("Types");
        root.add(types);

        // Cria subárvore para tipos de ponto flutuante.
        DefaultMutableTreeNode fpTypes = new DefaultMutableTreeNode("Floating Point");
        types.add(fpTypes);
        fpTypes.add(new DefaultMutableTreeNode("float"));
        fpTypes.add(new DefaultMutableTreeNode("double"));

        // Cria subárvore para tipos inteiros.
        DefaultMutableTreeNode intTypes = new DefaultMutableTreeNode("Integer");
        types.add(intTypes);
        intTypes.add(new DefaultMutableTreeNode("byte"));
        intTypes.add(new DefaultMutableTreeNode("short"));
        intTypes.add(new DefaultMutableTreeNode("int"));
        intTypes.add(new DefaultMutableTreeNode("long"));

        // Cria nós para char e boolean.
        types.add(new DefaultMutableTreeNode("char"));
        types.add(new DefaultMutableTreeNode("boolean"));

        // Cria subárvore para laços.
        DefaultMutableTreeNode loops = new DefaultMutableTreeNode("Loops");
        root.add(loops);
        loops.add(new DefaultMutableTreeNode("for"));
        loops.add(new DefaultMutableTreeNode("while"));
        loops.add(new DefaultMutableTreeNode("do"));

        // Cria a árvore.
        tree = new JTree(root);

        // Adiciona a árvore a um painel de rolagem.
        JScrollPane jsp = new JScrollPane(tree);

        // Adiciona o painel de rolagem ao centro do BorderLayout padrão.
        jfrm.add(jsp);

        // Adiciona o rótulo à região sul do BorderLayout padrão.
        jlab = new JLabel("Select from the tree.");
        jfrm.add(jlab, BorderLayout.SOUTH);

        // Trata eventos de seleção na árvore.
        tree.addTreeSelectionListener(new TreeSelectionListener() {
            public void valueChanged(TreeSelectionEvent tse) {
                jlab.setText("Selection is " +
                        tse.getPath().getLastPathComponent());
            }
        });
        // Exibe o quadro.
        jfrm.setVisible(true);
    }
    public static void main(String[] args) {
        // Cria a GUI na thread de despacho de evento.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new JTreeDemo();
            }
        });
    }
}
