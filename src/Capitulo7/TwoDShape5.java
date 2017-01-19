package Capitulo7;

//Adiciona mais construtores a TwoDShape

class TwoDShape5 {
    private double width;
    private double height;

    //Um construtor padrão
    TwoDShape5(){
        width = height = 0.0;
    }
    //Construtor parametrizado
    TwoDShape5(double w, double h){     //Construtor para TwoDShape
        width = w;
        height = h;
    }
    //Constrói o objeto com altura e largura iguais
    TwoDShape5(double x){
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
//Subclasse de TwoDShape para triângulos
class Triangle5 extends TwoDShape5{   //Triangle herda TwoDShape
    String style;

    //Construtor padrão
    Triangle5(){
        super();
        style = "none";
    }
    //Construtor
    Triangle5(String s, double w, double h){
        super(w, h);    //chama o construtor da superclasse
                        //Usa super() para chamar as várias formas do construtor de TwoDShape
        style = s;
    }
    //Construtor com um argumento
    Triangle5(double x){
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
class Shapes5{
    public static void main(String[] args) {
        Triangle5 t1 = new Triangle5();
        Triangle5 t2 = new Triangle5("filled", 4.0, 4.0);
        Triangle5 t3 = new Triangle5("outlined", 8.0, 12.0);

        t1 = t2;

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());

        System.out.println();

        System.out.println("Info for t3: ");
        t3.showStyle();
        t3.showDim();
        System.out.println("Area is " + t3.area());
    }
}
