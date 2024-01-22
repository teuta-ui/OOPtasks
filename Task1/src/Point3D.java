public class Point3D extends Point2D{
    private float z;

    public Point3D(float x, float y,float z){
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public float[] getXYZ() {
        float[] kordinata = new float[3];
        kordinata[0] = this.z;
        kordinata[1] = this.z;
        kordinata[2] = this.z;
        return kordinata;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x , y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "("+getX()+","+getY()+","+getZ()+")";
    }
}
