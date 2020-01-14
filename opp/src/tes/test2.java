package tes;

import java.util.ArrayList;
import java.util.List;

public class test2 extends test {
    int b;

    public test2(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "test2{" +
                "b=" + b +
                ", a=" +
                '}';
    }

}
