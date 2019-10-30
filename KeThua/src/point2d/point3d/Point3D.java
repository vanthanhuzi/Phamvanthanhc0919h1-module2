package point2d.point3d;

import java.util.Arrays;

public class Point3D extends Point2D {
    float z = 0.0f;
    float[] XYZ = new float[3];

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.XYZ[0] = x;
        this.XYZ[1] = y;
        this.XYZ[2] = z;
    }

    public float[] getXYZ() {
        return XYZ;
    }

    @Override
    public String toString() {
        return "(x,y,z)="+ Arrays.toString(getXYZ());
    }
}

class test {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        point3D.setXYZ(2, 4, 6);
        System.out.println(point3D);

    }
}
