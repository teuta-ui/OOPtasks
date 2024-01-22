public class Point2D {


    private float x;
    private float y;

    public Point2D() {
        this.x = 0;
        this.y = 0;
    }

     public Point2D(float x, float y){
            this.x = x;
            this.y = y;
        }


    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public float[] getXY(){
        float[] kordinata = new float[2];
        kordinata[0] = this.x;
        kordinata[1] = this.y;
        return kordinata;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "("+this.x+","+this.y+")";
    }
}
