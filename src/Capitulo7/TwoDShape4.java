package Capitulo7;

//Adiciona construtores a TwoDShape

class TwoDShape4 {
    private double width;
    private double height;

    //Construtor parametrizado
    TwoDShape4(double w, double h){     //Construtor para TwoDShape
        width = w;
        height = h;
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
//Subclasse de TwoDShape para triângulos
class Triangle4 extends TwoDShape4{   //Triangle herda TwoDShape
    String style;

    //Construtor
    Triangle4(String s, double w, double h){
        super(w, h);    //chama o construtor da superclasse
                        //Usa super() para executar o construtor de TwoDShape
        style = s;
    }
    double area(){
        return getWidth()*getHeight()/2;  //Usa métodos acessadores fornecidos pela superclasse
    }
    void showStyle(){
        System.out.println("Triangle is " + style);
    }
}
class Shapes4{
    public static void main(String[] args) {
        Triangle4 t1 = new Triangle4("filled", 4.0, 4.0);
        Triangle4 t2 = new Triangle4("outlined", 8.0, 12.0);

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
