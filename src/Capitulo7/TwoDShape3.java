package Capitulo7;

//Adiciona um construtor a Triangle
//Uma classe para objetos bidimensionais

class TwoDShape3 {
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
class Triangle3 extends TwoDShape3{   //Triangle herda TwoDShape
    String style;

    //Construtor
    Triangle3(String s, double w, double h){
        setWidth(w);    //Inicializa a parte do objeto referente a TwoDShape
        setHeight(h);

        style = s;
    }
    double area(){
        return getWidth()*getHeight()/2;  //Usa métodos acessadores fornecidos pela superclasse
    }
    void showStyle(){
        System.out.println("Triangle is " + style);
    }
}
class Shapes3{
    public static void main(String[] args) {
        Triangle3 t1 = new Triangle3("filled", 4.0, 4.0);
        Triangle3 t2 = new Triangle3("outlined", 8.0, 12.0);

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
