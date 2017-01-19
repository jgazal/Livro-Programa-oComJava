package Capitulo7;

//Usa o despacho dinâmico de métodos

class TwoDShape8 {
    private double width;
    private double height;
    private String name;

    //Construtor padrão
    TwoDShape8(){
        width = height = 0.0;
        name = "none";
    }
    //Construtor parametrizado
    TwoDShape8(double w, double h, String n){
        width = w;
        height = h;
        name = n;
    }
    //Constrói o objeto com altura e largura iguais
    TwoDShape8(double x, String n){
        width = height = x;
        name = n;
    }
    //Constrói um objeto a partir de outro
    TwoDShape8(TwoDShape8 ob){
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }
    //Métodos acessadores para width e height
    double getWidth(){return width;}
    double getHeight(){return height;}
    void setWidth(double w){width = w;}
    void setHeight(double h){height = h;}

    String getName(){return name;}

    void showDim(){
        System.out.println("Width and height are " + width + " and " + height);
    }
    double area(){  //Método area() definido por TwoDShape
        System.out.println("area() must be overridden");
        return 0.0;
    }
}
//Uma subclasse de TwoDShape para triângulos
class Triangle8 extends TwoDShape8{
    String style;

    //Construtor padrão
    Triangle8(){
        super();
        style = "none";
    }
    //Construtor de Triangle
    Triangle8(String s, double w, double h){
        super(w, h, "triangle");    //chama o construtor da superclasse

        style = s;
    }
    //Construtor com um argumento
    Triangle8(double x){
        super(x, "triangle");   //Chama o construtor da superclasse
        style = "filled";    //O padrão de style é filled
    }
    //Constrói um objeto a partir de outro
    Triangle8(Triangle8 ob){
        super(ob);  //passa o objeto para o construtor de TwoDShape.
        style = ob.style;
    }
    //Sobrepõe area() para Triangle
    double area(){
        return getWidth()*getHeight()/2;
    }
    void showStyle(){
        System.out.println("Triangle is " + style);
    }
}
//Subclasse de TwoDShape para retângulos
class Rectangle2 extends TwoDShape8{
    //Construtor padrão
    Rectangle2(){
        super();
    }
    //Construtor para Rectangle
    Rectangle2(double w, double h){
        super(w, h, "Rectangle");   //Chama o construtor da superclasse
    }
    //Constrói um quadrado
    Rectangle2(double x){
        super(x, "Rectangle");  //Chama o construtor da superclasse
    }
    //Constrói um objeto a partir de outro
    Rectangle2(Rectangle2 ob){
        super(ob);  //passa o objeto para o construtor de TwoDShape
    }
    boolean isSquare(){
        if(getWidth() == getHeight()) return true;
        return false;
    }
    //Sobrepõe area() para Rectangle
    double area(){
        return getWidth()*getHeight();
    }
}
class DynShapes{
    public static void main(String[] args) {
        TwoDShape8[] shapes = new TwoDShape8[5];

        shapes[0] = new Triangle8("outlined", 8.0, 12.0);
        shapes[1] = new Rectangle2(10);
        shapes[2] = new Rectangle2(10, 4);
        shapes[3] = new Triangle8(7.0);
        shapes[4] = new TwoDShape8(10, 20, "Generic");

        for(TwoDShape8 shape : shapes){
            System.out.println("Object is " + shape.getName());
            System.out.println("Area is " + shape.area());
            System.out.println();
        }


    }
}
