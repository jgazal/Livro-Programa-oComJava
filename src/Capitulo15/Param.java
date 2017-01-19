package Capitulo15;

// Passa um parâmetro para um applet.
import java.awt.*;
import java.applet.*;
//Estes parâmetros HTML são passados para o applet
/*
<applet code="Param" width=300 height=80>
<param name=author value="Herb and Dale">
<param name=purpose value="Demonstrate Parameters">
<param name=version value=2>
</applet>
*/
public class Param extends Applet {
    String author;
    String purpose;
    int ver;
    public void start() {
        String temp;
        author = getParameter("author");
        if(author == null) author = "not found";
        purpose = getParameter("purpose");
        if(purpose == null) purpose = "not found";  //é importante verificar se o parâmetro existe
        temp = getParameter("version");
        try {
            if(temp != null)
                ver = Integer.parseInt(temp);
            else
                ver = 0;
        } catch(NumberFormatException exc) {    //é importante verificar se as conversões numéricas foram bem sucedidas
            ver = -1; // código de erro
        }
    }
    public void paint(Graphics g) {
        g.drawString("Purpose: " + purpose, 10, 20);
        g.drawString("By: " + author, 10, 40);
        g.drawString("Version: " + ver, 10, 60);
    }
}
