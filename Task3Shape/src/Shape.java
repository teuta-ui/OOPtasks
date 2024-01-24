public class Shape {
   private String color;
   private boolean isfilled;

   public Shape(){
       this.color = "unknown";
       this.isfilled = true;
   }

   public Shape(String color, boolean isfilled){
       this.color = color;
       this.isfilled = isfilled;
   }

    public String getColor() {
        return color;
    }

    public boolean isIsfilled() {
        return isfilled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setIsfilled(boolean isfilled) {
        this.isfilled = isfilled;
    }

   public double getArea(){
       return 0;
   };
   public double getPerimeter(){
       return 0;
   };


    @Override
    public String toString() {
        return String.format("Shape with color of %s and %s", color, (isfilled ? "filled" : "not filled"));
    }
}
