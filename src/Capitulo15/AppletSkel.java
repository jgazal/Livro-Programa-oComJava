package Capitulo15;

// Esboço de applet baseado no AWT.
import java.awt.*;
import java.applet.*;
/*
<applet code="AppletSkel" width=300 height=100>
</applet>
*/
public class AppletSkel extends Applet {
    // Chamado primeiro.
    public void init() {
    // inicialização
    }
    /* Segundo a ser chamado, após init(). Também é chamado sempre
    que o applet é reiniciado. */
    public void start() {
    // inicia ou retoma a execução
    }
    // Chamado quando o applet é interrompido.
    public void stop() {
    // suspende a execução
    }
    /* Chamado quando o applet é encerrado. Este é o último
    método executado. */
    public void destroy() {
    // executa atividades de encerramento
    }
    // Chamado quando a janela de um applet baseado no AWT deve ser restaurada.
    public void paint(Graphics g) {
    // volta a exibir o conteúdo da janela
    }
}
