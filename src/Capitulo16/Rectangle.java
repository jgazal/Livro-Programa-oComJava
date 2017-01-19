package Capitulo16;

public class Rectangle {
    private int x, y, width, height;
    public Rectangle(int x, int y, int w, int h) {
        this.x = x; this.y = y; width = w; height = h;
    }
    public int getWidth() { return width; }
    public int getHeight() { return height; }
    public int getArea() { return width * height; }
    public int getPerimeter() { return 2 * (width + height); }
    public void setTopLeft(int newx, int newy) { x = newx; y = newy; }
    public void setSize(int w, int h) { width = w; height = h; }
}
