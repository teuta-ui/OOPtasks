public class Main {
    public static void main(String[] args) {

        GeometricObject ob1 = new Circle(10.0);
        System.out.println(ob1);
        System.out.println("Perimetri eshte: " + ob1.getPerimeter());
        System.out.println("Siperfaqja eshte: " + ob1.getArea());

        Resizable ob2 = new ResizableCircle(20.0);
        System.out.println(ob2);
        ob2.resize(40);
        System.out.println(ob2);

    }
}