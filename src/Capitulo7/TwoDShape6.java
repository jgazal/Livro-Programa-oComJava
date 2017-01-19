package Capitulo7;

//Hierarquia de vários níveis

class TwoDShape6 {
    private double width;
    private double height;

    //Um construtor padrão
    TwoDShape6(){
        width = height = 0.0;
    }
    //Construtor parametrizado
    TwoDShape6(double w, double h){     //Construtor para TwoDShape
        width = w;
        height = h;
    }
    //Constrói o objeto com altura e largura iguais
    TwoDShape6(double x){
        width = height = x;
    }
    //Métodos acessadores para width e height
    double getWidth(){return width;}
    double getHeight(){return height;}
    void setWidth(double w){width = w;}
    void setHeight(double h){height = h;}

    void showDim(){
        System.out.println("Width and height are " + width + " and " + height);
    }
}
//Estende TwoDShape
class Triangle6 extends TwoDShape6{   //Triangle herda TwoDShape
    String style;

    //Construtor padrão
    Triangle6(){
        super();
        style = "none";
    }
    Triangle6(String s, double w, double h){
        super(w, h);    //chama o construtor da superclasse

        style = s;
    }
    //Construtor com um argumento
    Triangle6(double x){
        super(x);   //Chama o construtor da superclasse
        style = "filled";    //O padrão de style é filled
    }
    double area(){
        return getWidth()*getHeight()/2;  //Usa métodos acessadores fornecidos pela superclasse
    }
    void showStyle(){
        System.out.println("Triangle is " + style);
    }
}
//Estende Triangle
class ColorTriangle extends Triangle6{  //ColorTriangle inclui todos os membros de Triangle e TwoDShape
    private String color;

    ColorTriangle(String c, String s, double w, double h){
        super(s, w, h);

        color = c;
    }
    String getColor(){return color;}

    void showColor(){
        System.out.println("Color is " + color);
    }
}

class Shapes6{
    public static void main(String[] args) {
        ColorTriangle t1 = new ColorTriangle("Blue", "outlined", 8.0, 12.0);
        ColorTriangle t2 = new ColorTriangle("Red", "filled", 8.0, 12.0);

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        t1.showColor();
        System.out.println("Area is " + t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        t2.showColor();
        System.out.println("Area is " + t2.area());
    }
}
