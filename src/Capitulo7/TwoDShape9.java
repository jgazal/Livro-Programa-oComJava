package Capitulo7;

//Cria uma classe abstrata

abstract class TwoDShape9 { //Agora TwoDShape é abstrata
    private double width;
    private double height;
    private String name;

    //Construtor padrão
    TwoDShape9(){
        width = height = 0.0;
        name = "none";
    }
    //Construtor parametrizado
    TwoDShape9(double w, double h, String n){
        width = w;
        height = h;
        name = n;
    }
    //Constrói o objeto com altura e largura iguais
    TwoDShape9(double x, String n){
        width = height = x;
        name = n;
    }
    //Constrói um objeto a partir de outro
    TwoDShape9(TwoDShape9 ob){
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
    abstract double area(); //Transforma area() em um método abstrato

}
//Uma subclasse de TwoDShape para triângulos
class Triangle9 extends TwoDShape9{
    String style;

    //Construtor padrão
    Triangle9(){
        super();
        style = "none";
    }
    //Construtor de Triangle
    Triangle9(String s, double w, double h){
        super(w, h, "triangle");    //chama o construtor da superclasse

        style = s;
    }
    //Construtor com um argumento
    Triangle9(double x){
        super(x, "triangle");   //Chama o construtor da superclasse
        style = "filled";    //O padrão de style é filled
    }
    //Constrói um objeto a partir de outro
    Triangle9(Triangle9 ob){
        super(ob);  //passa o objeto para o construtor de TwoDShape.
        style = ob.style;
    }
    double area(){
        return getWidth()*getHeight()/2;
    }
    void showStyle(){
        System.out.println("Triangle is " + style);
    }
}
//Subclasse de TwoDShape para retângulos
class Rectangle3 extends TwoDShape9{
    //Construtor padrão
    Rectangle3(){
        super();
    }
    //Construtor para Rectangle
    Rectangle3(double w, double h){
        super(w, h, "Rectangle");   //Chama o construtor da superclasse
    }
    //Constrói um quadrado
    Rectangle3(double x){
        super(x, "Rectangle");  //Chama o construtor da superclasse
    }
    //Constrói um objeto a partir de outro
    Rectangle3(Rectangle3 ob){
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
class AbsShape{
    public static void main(String[] args) {
        TwoDShape9[] shapes = new TwoDShape9[4];

        shapes[0] = new Triangle9("outlined", 8.0, 12.0);
        shapes[1] = new Rectangle3(10);
        shapes[2] = new Rectangle3(10, 4);
        shapes[3] = new Triangle9(7.0);

        for(TwoDShape9 shape : shapes){
            System.out.println("Object is " + shape.getName());
            System.out.println("Area is " + shape.area());
            System.out.println();
        }


    }
}
