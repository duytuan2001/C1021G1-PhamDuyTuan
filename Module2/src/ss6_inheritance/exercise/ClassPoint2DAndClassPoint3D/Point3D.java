package ss6_inheritance.exercise.ClassPoint2DAndClassPoint3D;

public class Point3D extends Point2D {
   private float z = 0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public Point3D(){

    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        setX(getX());
        setY(getY());
        this.z =z;
    }public float[] getXYZ(){
        float[]arr= new float[3];
        arr[0] = this.getX();
        arr[1] = this.getY();
        arr[2] = this.getZ();
        return arr;
    }


    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                ", x=" + this.getX() +
                ", y=" + this.getY() +

                '}';
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D(2,3,4);
        System.out.println(point3D);
    }
}
