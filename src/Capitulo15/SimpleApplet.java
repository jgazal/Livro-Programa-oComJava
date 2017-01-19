package Capitulo15;

import java.awt.*;
import java.applet.*;

//Este HTML é usado pelo appletviewer para execução do applet.
/*<applet code="SimpleApplet" width=200 height=60>
</applet>*/


public class SimpleApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Java makes applets easy.", 20, 20);
    }
}
