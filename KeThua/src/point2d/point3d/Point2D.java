package point2d.point3d;

import java.util.Arrays;

public class Point2D {
    float x = 0.0f;
    float y = 0.0f;
    float[] XY = new float[2];
    public Point2D(){

    }
    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.XY[0] = x;
        this.XY[1] = y;
    }
    public float[] getXY(){
        return XY;
    }

    @Override
    public String toString() {
        return "(x,y)"+ Arrays.toString(getXY());
    }
}
class test1{
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        point2D.setXY(2,3);
        System.out.println(point2D);
    }
}
