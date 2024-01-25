public class ResizableCircle extends Circle implements Resizable{
    public ResizableCircle(double radius) {
        super(radius);
    }

    public void resize(int percent){
        radius *= percent/100.0;
    }

}
