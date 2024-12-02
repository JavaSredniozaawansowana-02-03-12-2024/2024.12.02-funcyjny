package com.comarch.szkolenia.funkcyjny.abstrakcja;

public abstract class KlasaAbstrakcyjna {
    private int x;
    public double y;
    protected String z;

    public KlasaAbstrakcyjna(int x, double y, String z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public KlasaAbstrakcyjna() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getZ() {
        return z;
    }

    public void setZ(String z) {
        this.z = z;
    }

    abstract void metodaAbstrakcyjna();
}
