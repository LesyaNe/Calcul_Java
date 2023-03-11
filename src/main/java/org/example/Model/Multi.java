package org.example.Model;

public class Multi extends CalcI {

    public Multi() {
    }

    public int result() {

        return x * y;
    }

    public void setX(int value) {

        super.x = value;
    }

    public void setY(int value) {

        super.y = value;
    }
}
