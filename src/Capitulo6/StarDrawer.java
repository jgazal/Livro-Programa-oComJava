package Capitulo6;

class StarDrawer {
    void drawStars(int n) {
        if(n == 1)
            System.out.print("*");
        else {
            System.out.print("*");
            drawStars(n-1); //uma chama recursiva
        }
    }
}
class StarDrawingDemo {

    public static void main(String[] args) {
        StarDrawer drawer = new StarDrawer();

        drawer.drawStars(1); // apenas o caso base
        System.out.println();
        drawer.drawStars(2); //uma chamada recursiva
        System.out.println();
        drawer.drawStars(3); //duas chamadas recursivas
        System.out.println();
        drawer.drawStars(10); //nove chamas recursivas
        System.out.println();
    }
}

