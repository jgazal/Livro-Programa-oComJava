package Capitulo7;

//Uma hierarquia de classe simples

class TwoDShape {
    double width;
    double height;

    void showDim(){
        System.out.println("Width and height are " + width + " and " + height);
    }
}
//Uma subclasse de TwoDShape para triângulos
class Triangle extends TwoDShape{   //Triangle herda TwoDShape
    String style;

    double area(){
        return width*height/2;  //Triangle pode referenciar os membros de TwoDShape como se fossem seus
    }
    void showStyle(){
        System.out.println("Triangle is " + style);
    }
}
//Uma subclasse de TwoDShape para retângulos
class Rectangle extends TwoDShape{
    boolean isSquare(){
        if(width == height) return true;
        return false;
    }
    double area(){
        return width*height;
    }
}

class Shapes{
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        t1.width = 4.0;
        t1.height = 4.0;
        t1.style = "filled";

        t2.width = 8.0;
        t2.height = 12.0;
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
