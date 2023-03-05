package org.example.Model;

public class Sum extends CalcI {

    public Sum() {
    }

    public int result() {
        return x + y;
    }

    public void setX(int value) {
        super.x = value;
    }

    public void setY(int value) {
        super.y = value;
    }

}
