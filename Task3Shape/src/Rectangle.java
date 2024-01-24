public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(){
        super();
        this.length = 1.0;
        this.width = 1.0;
    }

    public Rectangle( double length, double width, String color, boolean isfilled){
        super(color,isfilled);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(){
        return width * length;
    }

    public double getPerimeter(){
        return 2 * (width+length);
    }

    @Override
    public String toString() {
        return String.format("Rectangle with width = %d and length = %d, which is a subclass of %s", width, length, super.toString());
    }
}
