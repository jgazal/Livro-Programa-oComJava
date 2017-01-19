package Capitulo18;

// Demonstra JTable.

import java.awt.*;
import javax.swing.*;

public class JTableDemo {
    JTableDemo() {
        // Cria um contêiner JFrame.
        JFrame jfrm = new JFrame("JTable Example");

        // Fornece um tamanho inicial para o quadro.
        jfrm.setSize(400, 300);

        // Encerra o programa quando o usuário fecha o aplicativo.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Inicializa os cabeçalhos das colunas.
        String[] Headings = { "Name", "Student ID", "Midterm", "Final" };

        // Inicializa data.
        String[][] data = {
                { "Tom", " 4-616", " 97", " 87" },
                { "Ken", " 3-786", " 88", " 95" },
                { "Rachel", " 4-674", " 92", " 83" },
                { "Sherry", " 3-235", " 91", " 99" },
                { "Adam", " 2-923", " 76", " 96" },
                { "Jon", " 3-561", " 84", " 80" },
                { "Stuart", " 1-337", " 62", " 74" },
                { "Mary", " 4-731", " 68", " 58" },
                { "Todd", " 2-924", " 82", " 72" },
                { "Shane", " 2-434", " 93", " 91" },
                { "Robert", " 3-769", " 99", " 92" },
        };
        // Cria a tabela.
        JTable table = new JTable(data, Headings);

        // Adiciona a tabela a um painel de rolagem.
        JScrollPane jsp = new JScrollPane(table);

        // Adiciona o painel de rolagem ao painel de conteúdo.
        jfrm.add(jsp);

        // Exibe o quadro.
        jfrm.setVisible(true);
    }
    public static void main(String[] args) {
        // Cria a GUI na thread de despacho de evento.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new JTableDemo();
            }
        });
    }
}
