package shapes;

public abstract class Shape {

    protected double h;
    protected double w;

    public Shape(double h, double w) {
        this.w = w;
        this.h = h;
    }

    public abstract double getArea();
}
