package Capitulo7;

class TwoDShape7 {
    private double width;
    private double height;

    //Um construtor padrão
    TwoDShape7(){
        width = height = 0.0;
    }
    //Construtor parametrizado
    TwoDShape7(double w, double h){
        width = w;
        height = h;
    }
    //Constrói o objeto com altura e largura iguais
    TwoDShape7(double x){
        width = height = x;
    }
    //Constrói um objeto a partir de outro
    TwoDShape7(TwoDShape7 ob){
        width = ob.width;
        height = ob.height;
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
class Triangle7 extends TwoDShape7{
    String style;

    //Construtor padrão
    Triangle7(){
        super();
        style = "none";
    }
    //Construtor de Triangle
    Triangle7(String s, double w, double h){
        super(w, h);    //chama o construtor da superclasse

        style = s;
    }
    //Construtor com um argumento
    Triangle7(double x){
        super(x);   //Chama o construtor da superclasse
        style = "filled";    //O padrão de style é filled
    }
    //Constrói um objeto a partir de outro
    Triangle7(Triangle7 ob){
        super(ob);  //passa o objeto para o construtor de TwoDShape. Passa uma referência Triangle para o construtor.
        style = ob.style;
    }

    double area(){
        return getWidth()*getHeight()/2;
    }
    void showStyle(){
        System.out.println("Triangle is " + style);
    }
}
class Shapes7{
    public static void main(String[] args) {
        Triangle7 t1 = new Triangle7("outlined", 8.0, 12.0);

        //faz uma cópia de t1
        Triangle7 t2 = new Triangle7(t1);

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
