public class Circle implements GeometricObject {
   protected double radius;

   public Circle(double radius){
       this.radius = radius;
   }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double getArea() {
        return Math.pow(radius,2) * Math.PI;
    }

    public String toString() {
        return String.format("Circle with radius = %1$f", radius);
    }

}
