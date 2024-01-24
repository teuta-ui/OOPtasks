public class Circle extends Shape{
    private double radius;

    public Circle(){
        super();
        this.radius = 1.0;
    }

    public Circle(double radius, String color, boolean isfilled){
        super(color, isfilled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }

    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return String.format("Circle with radius = %d, which is a subclass of %s", radius, super.toString());
    }
}
