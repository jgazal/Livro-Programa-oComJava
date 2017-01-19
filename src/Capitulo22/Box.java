package Capitulo22;

// Sobrepõe toString() para a classe Box.

class Box {
    double width;
    double height;
    double depth;
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    // Fornece a representação de Box na forma de string.
    public String toString() {  //Sobrepõe toString( ) para Box
        return "Dimensions are " + width + " by " +
                depth + " by " + height + ".";
    }
}
class OverrideToString {
    public static void main(String[] args) {
        Box b = new Box(10, 12, 14);
        String str = "Box b: " + b; // toString() é chamado aqui
        System.out.println(b); // toString() é chamado aqui
        System.out.println(str);
    }
}
