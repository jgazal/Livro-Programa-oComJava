package Capitulo7;

//Usa métodos acessadores para configurar e examinar membros privados
//Uma classe para objetos bidimensionais

class TwoDShape2 {
    private double width;   //Agora esses membros
    private double height;  //são privados

    //Métodos acessadores para width e height
    double getWidth(){return width;}
    double getHeight(){return height;}
    void setWidth(double w){width = w;}
    void setHeight(double h){height = h;}

    void showDim(){
        System.out.println("Width and height are " + width + " and " + height);
    }
}
//Uma subclasse de TwoDShape para triângulos
class Triangle2 extends TwoDShape2{   //Triangle herda TwoDShape
    String style;

    double area(){
        return getWidth()*getHeight()/2;  //Usa métodos acessadores fornecidos pela superclasse
    }
    void showStyle(){
        System.out.println("Triangle is " + style);
    }
}
class Shapes2{
    public static void main(String[] args) {
        Triangle2 t1 = new Triangle2();
        Triangle2 t2 = new Triangle2();

        t1.setWidth(4.0);
        t1.setHeight(4.0);
        t1.style = "filled";

        t2.setWidth(8.0);
        t2.setHeight(12.0);
        t2.style = "outlined";

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());
    }
}
