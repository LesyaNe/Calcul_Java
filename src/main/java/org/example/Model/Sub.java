package org.example.Model;

public class Sub extends CalcI {

    public Sub() {
    }

    public int result() {
        return x - y;
    }

    public void setX(int value) {
        super.x = value;
    }

    public void setY(int value) {
        super.y = value;
    }
}
